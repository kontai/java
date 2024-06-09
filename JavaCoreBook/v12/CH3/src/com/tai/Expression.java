package com.tai;

public class Expression {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
//        double d=Double.NaN;
//        System.out.println(d);
//        System.out.println(2.0-1.1);
//        System.out.println(0x10p2); //16x2的平方
//        System.out.println('\u2122');

        /*
        double papaerwidth = 8.5;
        double paperheight = 11;
        System.out.println("Paper size in  centimeters: " + papaerwidth +
                CM_PER_INCH + " by " + paperheight * CM_PER_INCH);
        System.out.println(Math.pow(2,3));

         */

        //switch表達式(java14引人)
        int sesonCode=2;
        String seasonName=switch(sesonCode){
            case 0->"Sprint";
            case 1->"Summer";
            case 2->"Autumn";
            case 3->"Winter";
            default->"end";
        };
        System.out.println("season name: "+seasonName);

        char chNum='c';
        String charSet=switch (chNum){
            case 'a'->"1";
            case 'b'->"2";
            case 'c'->"3";
            default -> throw new IllegalStateException("Unexpected value: " + chNum);
        };
        System.out.println(charSet);
        
        enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE}
        Size itemSize=Size.MEDIUM;
        String label=switch(itemSize){
            case SMALL->"S";
            case MEDIUM->"M";
            case LARGE->"L";
            case EXTRA_LARGE -> "XL";
        };
        System.out.println(label);
    }
}