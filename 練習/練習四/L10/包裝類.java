package 練習.練習四.L10;

public class 包裝類 {
    public static void main(String[] args) {
        Integer i = new Integer("23");
        System.out.println((i.compareTo(new Integer(4))));
        System.out.println(i);

        Integer i1 = new Integer(23);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("23");
        System.out.println(i2);

        Integer i3 = Integer.parseInt("23");
        System.out.println(i3);

        Integer newInt = (int) 23.4;
//        Double d=new Double();
        Double d = Double.valueOf("23.45");
        int i4 = (Integer.valueOf("23")).intValue();
        double d2 = (Double.valueOf("23.4")).doubleValue();
        int i5 = (Double.valueOf("23.4")).intValue();
        String s = (Double.valueOf("23.4")).toString();
    }
}
