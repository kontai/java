package 內部類.匿名內部類;

abstract class Pip {
    abstract public void run();

    public void print() {
    };
}

abstract class Pip2{
    abstract public Pip2 run();
    abstract public void Go();
}

class Fun {
    class In {

    }

    public void func() {

        // Method I
        class One extends Pip {
            public void run() {
                System.out.println("匿名函數 I");
            }

        }

        One i = new One();
        i.run();


        // Method II
       new Pip() {   
            public void run() {
                System.out.println("匿名函數 II");
            }

        }.run();

        // Method II  - 2
        new Pip2(){
            public Pip2 run(){
                System.out.println("匿名函數 III ");
                return this;
            }

            public void Go(){
                System.out.println("匿名函數 III-同時調用二方法");
            }
        }.run().Go();

    }
}

class Anonymous {
    public static void main(String[] args) {
        Fun a = new Fun();
        a.func();

    }

}
