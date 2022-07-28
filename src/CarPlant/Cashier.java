package CarPlant;

import CarPlant.CarTypes.Car;

public class Cashier {
    private Car car;
    private double total;


    public Car getMoney(Car car) {
        if(car == null) {
            return null;
        } else {
        this.total = this.total + car.getPrice();
        return car; }
    }
    public double getTotal() {
        return total;
    }

}
