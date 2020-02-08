package 基本數據類型.tmp;

import java.util.Arrays;

public class sortStringNum {
    public static final String spcae_separator = " ";

    public static void main(String[] args)
    {
        String str = "-9 20 49 21 98   84";

        String[] str_arr = strToArray(str);   //split string with space char
        int[] int_Array = toIntArray(str_arr);    //convert string to int
        intArraySort(int_Array);    //sort array
        String AfterSort_str = int_To_String(int_Array);
        System.out.print(AfterSort_str);


    }

    private static String int_To_String(int[] int_array)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < int_array.length; i++)
        {
            if (i < int_array.length - 1)
            {
                sb.append(int_array[i]).append(spcae_separator);
            }
            else
            {
                sb.append(int_array[i]);
            }
        }
        return sb.toString();
    }

    private static void intArraySort(int[] int_array)
    {
        Arrays.sort(int_array);
    }

    private static int[] toIntArray(String[] str_arr)
    {
        int[] arr = new int[str_arr.length];
        for (int i = 0; i < str_arr.length; i++)
        {
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;
    }

    private static String[] strToArray(String str)
    {
        return str.split(spcae_separator + "+");  //正則表達式
    }
}
