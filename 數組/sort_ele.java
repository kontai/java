import java.util.Arrays;  //導入package
class sort_ele{
    public static void main(String[] args){
        int []arr={3,4,56,23,567};
        System.out.println("arr="+Arrays.toString(arr));
        Arrays.sort(arr); //調用Arrays sort方法對array排序
        String sort_arr=Arrays.toString(arr);  //將array轉為字串
        System.out.println("After sorted="+sort_arr);

        int i=0;
        int research=Arrays.binarySearch(arr, i); //二元搜尋法 在arr中尋找i值 並返回元素位置 , 找不到就返回(-(最接近元素位置-1))
        System.out.println("搜尋到:"+research);
    }
}