class Getmax {
    public static void main(String[] args){

        int[] abc = { 0, 2, 3, 4, 4 };
        System.out.println("Max=" + getMax(abc));
    }

    public static int getMax(int[] arr)
	{
		//定义变量记录较大的值，初始化为数组中的任意一个元素。
		int max = arr[0];

		for(int x=0; x<5; x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;

    }

}