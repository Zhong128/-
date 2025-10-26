package Dome;

public class Card {
    private String name;
    private String carID;
    private double money;
    private String phone;

    public void deposit(double money){
        this.money += money;
    }

    public void consume(double money){
        this.money -= money;
    }

    public Card() {
    }

    public Card(String name, String carID, double money, String phone) {
        this.name = name;
        this.carID = carID;
        this.money = money;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
