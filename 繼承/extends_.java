package 繼承;

class Animal {
    int a = 2;
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        run();
    }

    public void run() {
        System.out.println(name + " is running...." + " a=" + a);
    }
}

class Dog extends Animal {
    int a = 4;

    public Dog(String name, String color) {
        super(name, color);
    }

    public void run() {
        System.out.println(name + " is running...." + " a=" + a);
    }
}

class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
    }
}

class extends_ {
    public static void main(String[] args) {
//        Dog d = new Dog("牧羊犬", "brown");
//        d.run();
        Animal ann = new Dog("杜賓", "bromn");
        ann.run();

    }
}