package 封裝;

class Car {
    int wheel;
    String name;
    String color;

    public void run() {
        System.out.println("oh...my Car have " + wheel + " wheel");
        if (wheel != 4) {
            System.out.println("DamnIt,I got Fix this shit...");
            Factory rep = new Factory();
            rep.repair(this);
        }
        System.out.println("car is ok now,load " + (4 - wheel) + " wheels");
        System.out.println("Car is running...");
    }

}

class Factory {
    String name;
    String address;
    String tel;

    public Car repair(Car c) {
        c.wheel = 4;
        name = "konti";
        address = "Taiwan Taoyam";
        tel = "123454321";
        return c;
    }
}

class Car_Running {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.wheel = 3;
        myCar.name = "BMW";
        myCar.color = "black";
        myCar.run();
    }
}