package 內部類;

class Out {
    int i = 9;

    public void test() {
        /*
        內部類在局部位置上，只能訪問局部中被final修飾的局部變量
       (局部變量生存週期短,當方法return後,局部變量就消失了,但內部類還存在)
         */
        final int j = 8;
        class In {
            public void inn() {
                System.out.println("局部內部類....");
                System.out.println("局部內部類外的成員變量...."+i);    
                System.out.println("局部內部類外,方法內的成員變量...."+i);    
                System.out.println("局部內部類內成員變量...."+j);    
            }
        }
        /*
         * 局部內部類創建方式(在方法內創建對象調用)
         */
        In aaa = new In();
        aaa.inn();
    }

}

class InFunc {
    public static void main(String[] args) {
        Out out = new Out();
        out.test();
    }
}