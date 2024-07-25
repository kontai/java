package 枚舉;

class enumDemo {
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println(str.length());
        System.out.println(String.join(" ","a","b","c","d"));
        int[] cp=str.codePoints().toArray();
        String s=new String(cp,0,cp.length);
        System.out.println(cp);
        System.out.println(s);
    }
}
