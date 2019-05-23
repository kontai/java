class lab {
    public static void main(String[] args) {
        AAA: for (int i = 0; i < 3; i++) {   //AAA BBB:標記 (可以其他名字代替)
            BBB: for (int j = 0; j < 4; j++) {
                System.out.println(i + j);
                break AAA;
            }
        }
    }
}