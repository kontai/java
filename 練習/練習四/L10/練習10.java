package 練習.練習四.L10;

public class 練習10 {
    public static void main(String[] args) {
        java.math.BigInteger x=new java.math.BigInteger("3");
        java.math.BigInteger y=new java.math.BigInteger("7");
        java.math.BigInteger z=x.add(y);
        System.out.println("x is "+x);
        System.out.println("y is "+y);
        System.out.println("z is "+z);
        System.out.println((System.currentTimeMillis()/1000)%(3600*24)/3600);;
    }
}
