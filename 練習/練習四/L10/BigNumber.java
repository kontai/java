package 練習.練習四.L10;

import java.math.*;

public class BigNumber {
    public static void main(String[] args) {
        Long temp=Long.MAX_VALUE;
        BigInteger a=new BigInteger(temp.toString());
        BigInteger b=new BigInteger("123");
        BigInteger c=a.multiply(b);
        System.out.println(factorial(50));
    }

    public static BigInteger factorial(long ll)
    {
        BigInteger temp=BigInteger.valueOf(1L);
        for(int i=1;i<=ll;i++)
        {
            temp=temp.multiply(new BigInteger(i+""));
        }
        return temp;
    }
}
