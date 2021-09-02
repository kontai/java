package fileDemo;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
//        Test1();
        Test2();
//        getCurrentPath();
//        getPath();
        A a = new A();
        B b = new B();
        A ab = new B();
        System.out.println(a.getClass() + " " + A.class);
        System.out.println(b.getClass() + " " + B.class);
        System.out.println(ab.getClass());

    }

    private static void Test2() {
        File file = new File("src/fileDemo/1.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {

                FileWriter fw = null;
                BufferedWriter bw = null;

                try {
                    fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                    bw.write("234");
                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void getPath() {
        System.out.println(demo1.class.getResource(""));
        System.out.println(demo1.class.getResource("/"));
        System.out.println(demo1.class);
//        System.out.println(demo1.getClass());;

    }

    static void Test1() {
        String path = "src/fileDemo/1.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            try {
                String num = br.readLine();
                System.out.println("number=" + num);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void getCurrentPath() {
        File file = new File("src/fileDemo/1.txt");
        System.out.println("path=" + file.getPath());
        System.out.println("Absolutiote path=" + file.getAbsolutePath());
        try {
            System.out.println("Canonical Path" + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return currentPath;
    }
}
