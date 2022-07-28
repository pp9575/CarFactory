package CarPlant;

import CarPlant.CarTypes.Car;

public class Customer {
    private String name;
    private double money;


    public double getMoney() {
        return money;
    }

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public void buyCar(Car car) {
        if (car == null) {
            System.out.println(this.name + ": у меня не хватило, пойду плакать");
        } else {
            System.out.println(this.name + " купил машину за " + car.getPrice() + ". Осталось " + (this.money - car.getPrice()));
        }
    }

    public String getName() {
        return name;
    }
}
