package 抽象類.發紅包;

public class User {
    private String name;    //姓名
    private int money;      //餘額;當前用戶所擁有餘額
    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show()
    {
        System.out.println("name: "+this.name+",money: "+this.money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
