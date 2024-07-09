/**
 * ClassName: AnnoyInnerClassDemo
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/8 上午12:25
 * @Version 1.0
 */
public class AnnoyInnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

    }
}

class Outer {
    void method() {
       Object out= new Object() {
            public void test() {
                System.out.println("SKG");
            }
        };
    }
}
