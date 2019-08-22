package 內部類;

class Outer {
    public void test() {
        int y = 100;
        class In {
            int x = 0;

            public void print() {
                System.out.println("mehod of In...");
                System.out.println(y);
            }
        }
        In a = new In();
        a.print();
    }
}

class Test {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.test();

    }
}