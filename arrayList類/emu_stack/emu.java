package arrayList類.emu_stack;

public class emu {
    public static void main(String[] args) {
        Mystack s=new Mystack();
        Mystack I=new Mystack();
        s.push("AbC");
        s.push("def");
        System.out.println(s.getSize());
        System.out.println(s.peek());
        System.out.println(s);
        I.push(3);
        I.push("monkey");
        System.out.println(I);


    }
}
