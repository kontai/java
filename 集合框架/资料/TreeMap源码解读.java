import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;1.TreeMap��ÿһ���ڵ���ڲ�����
K key;					//��
V value;				//ֵ
Entry<K,V> left;		//���ӽڵ�
Entry<K,V> right;		//���ӽڵ�
Entry<K,V> parent;		//���ڵ�
boolean color;			//�ڵ����ɫ




2.TreeMap������Ҫ֪����һЩ��Ա����
public class TreeMap<K,V>{
   
    //�Ƚ�������
    private final Comparator<? super K> comparator;

	//���ڵ�
    private transient Entry<K,V> root;

	//���ϵĳ���
    private transient int size = 0;

   

3.�ղι���
	//�ղι������û�д��ݱȽ�������
	 public TreeMap() {
        comparator = null;
    }
	
	
	
4.���ι���
	//���ι�����Ǵ����˱Ƚ�������
	public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
	
	
5.���Ԫ��
	public V put(K key, V value) {
        return put(key, value, true);
    }

����һ����
��������ֵ
�������������ظ���ʱ���Ƿ���Ҫ����ֵ
		true������
		false��������
		
	private V put(K key, V value, boolean replaceOld) {
		//��ȡ���ڵ�ĵ�ֵַ����ֵ���ֲ�����t
        Entry<K,V> t = root;
		//�жϸ��ڵ��Ƿ�Ϊnull
		//���Ϊnull����ʾ��ǰ�ǵ�һ����ӣ���ѵ�ǰҪ��ӵ�Ԫ�أ��������ڵ�
		//�����Ϊnull����ʾ��ǰ���ǵ�һ����ӣ���������жϼ���ִ������Ĵ���
        if (t == null) {
			//�����ĵײ㣬�ᴴ��һ��Entry���󣬰����������ڵ�
            addEntryToEmptyMap(key, value);
			//��ʾ��ʱû�и����κε�Ԫ��
            return null;
        }
		//��ʾ����Ԫ�صļ��Ƚ�֮��Ľ��
        int cmp;
		//��ʾ��ǰҪ��ӽڵ�ĸ��ڵ�
        Entry<K,V> parent;
		
		//��ʾ��ǰ�ıȽϹ���
		//��������ǲ�ȡĬ�ϵ���Ȼ������ô��ʱcomparator��¼����null��cpr��¼��Ҳ��null
		//��������ǲ�ȡ�Ƚ�ȥ����ʽ����ô��ʱcomparator��¼���Ǿ��ǱȽ���
        Comparator<? super K> cpr = comparator;
		//��ʾ�жϵ�ǰ�Ƿ��бȽ�������
		//��������˱Ƚ������󣬾�ִ��if����Ĵ��룬��ʱ�ԱȽ����Ĺ���Ϊ׼
		//���û�д��ݱȽ������󣬾�ִ��else����Ĵ��룬��ʱ����Ȼ����Ĺ���Ϊ׼
        if (cpr != null) {
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        } else {
			//�Ѽ�����ǿת��ǿת��Comparable���͵�
			//Ҫ�󣺼�����Ҫʵ��Comparable�ӿڣ����û��ʵ������ӿ�
			//��ʱ��ǿת��ʱ�򣬾ͻᱨ��
            Comparable<? super K> k = (Comparable<? super K>) key;
            do {
				//�Ѹ��ڵ㵱����ǰ�ڵ�ĸ��ڵ�
                parent = t;
				//����compareTo�������Ƚϸ��ڵ�͵�ǰҪ��ӽڵ�Ĵ�С��ϵ
                cmp = k.compareTo(t.key);
				
                if (cmp < 0)
					//����ȽϵĽ��Ϊ����
					//��ô���������ڵ�����ȥ��
                    t = t.left;
                else if (cmp > 0)
					//����ȽϵĽ��Ϊ����
					//��ô���������ڵ���ұ�ȥ��
                    t = t.right;
                else {
					//����ȽϵĽ��Ϊ0���Ḳ��
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        }
		//�ͻ�ѵ�ǰ�ڵ㰴��ָ���Ĺ���������
        addEntry(key, value, parent, cmp < 0);
        return null;
    }	
	
	
	
	 private void addEntry(K key, V value, Entry<K, V> parent, boolean addToLeft) {
        Entry<K,V> e = new Entry<>(key, value, parent);
        if (addToLeft)
            parent.left = e;
        else
            parent.right = e;
		//������֮����Ҫ���պ�����Ĺ�����е���
        fixAfterInsertion(e);
        size++;
        modCount++;
    }
	
	
	
	private void fixAfterInsertion(Entry<K,V> x) {
		//��Ϊ������Ľڵ�Ĭ�Ͼ��Ǻ�ɫ��
        x.color = RED;

		//���պ�ڹ�����е���
		
		//parentOf:��ȡx�ĸ��ڵ�
		//parentOf(parentOf(x)):��ȡx��үү�ڵ�
		//leftOf:��ȡ���ӽڵ�
        while (x != null && x != root && x.parent.color == RED) {
			
			
			//�жϵ�ǰ�ڵ�ĸ��ڵ���үү�ڵ�����ӽڵ㻹�����ӽڵ�
			//Ŀ�ģ�Ϊ�˻�ȡ��ǰ�ڵ������ڵ�
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
				//��ʾ��ǰ�ڵ�ĸ��ڵ���үү�ڵ�����ӽڵ�
				//��ô����Ϳ�����rightOf��ȡ����ǰ�ڵ������ڵ�
                Entry<K,V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
					//����ڵ�Ϊ��ɫ�Ĵ�����
					
					//�Ѹ��ڵ�����Ϊ��ɫ
                    setColor(parentOf(x), BLACK);
					//������ڵ�����Ϊ��ɫ
                    setColor(y, BLACK);
					//��үү�ڵ�����Ϊ��ɫ
                    setColor(parentOf(parentOf(x)), RED);
					
					//��үү�ڵ�����Ϊ��ǰ�ڵ�
                    x = parentOf(parentOf(x));
                } else {
					
					//����ڵ�Ϊ��ɫ�Ĵ�����
					
					
					//��ʾ�жϵ�ǰ�ڵ��Ƿ�Ϊ���ڵ�����ӽڵ�
                    if (x == rightOf(parentOf(x))) {
						
						//��ʾ��ǰ�ڵ��Ǹ��ڵ�����ӽڵ�
                        x = parentOf(x);
						//����
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
				//��ʾ��ǰ�ڵ�ĸ��ڵ���үү�ڵ�����ӽڵ�
				//��ô����Ϳ�����leftOf��ȡ����ǰ�ڵ������ڵ�
                Entry<K,V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
		
		//�Ѹ��ڵ�����Ϊ��ɫ
        root.color = BLACK;
    }
	
	
	
	
	
	
	
6.����˼�����⣺
6.1TreeMap���Ԫ�ص�ʱ�򣬼��Ƿ���Ҫ��дhashCode��equals������
��ʱ�ǲ���Ҫ��д�ġ�


6.2HashMap�ǹ�ϣ��ṹ�ģ�JDK8��ʼ�����飬�����������ɵġ�
��Ȼ�к������HashMap�ļ��Ƿ���Ҫʵ��Compareable�ӿڻ��ߴ��ݱȽ��������أ�
����Ҫ�ġ�
��Ϊ��HashMap�ĵײ㣬Ĭ�������ù�ϣֵ�Ĵ�С��ϵ�������������




6.3TreeMap��HashMap˭��Ч�ʸ��ߣ�
����������������8��Ԫ�أ���8��Ԫ���γ���������ʱTreeMap��Ч��Ҫ����
��������������ֵļ��ʷǳ����١�
һ����ԣ�����HashMap��Ч��Ҫ���ߡ�



6.4�������Map�����У�java���ṩһ��������ظ��ˣ����Ḳ�ǵ�put�����أ�
��ʱputIfAbsent������Ҫ��
����һ��˼�룺
	�����е��߼����������ԣ��������ֻ֪�������е�A�棬���Ҵ����л��������б������Կ��������Եķ�����
	��ô���߼�һ������B�档
	
	ϰ�ߣ�
		boolean���͵ı������ƣ�һ��ֻ��AB���棬��Ϊbooleanֻ������ֵ
		int���͵ı������ƣ�һ�����������棬��Ϊint����ȡ���ֵ��
		



6.5����˫�м��ϣ��Ժ����ѡ��
	HashMap LinkedHashMap TreeMap
	
	Ĭ�ϣ�HashMap��Ч����ߣ�
	���Ҫ��֤��ȡ����LinkedHashMap
	���Ҫ��������TreeMap
	
	

	
	
