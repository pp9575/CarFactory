package CarPlant.CarTypes;

import CarPlant.CarParts.*;
import CarPlant.CarException;
import CarPlant.Country;

public abstract class Truck extends Car {
//    Для грузового фургона есть дополнительный параметр - грузоподъемность (количество килограмм)
    private int cargoWeigh;

    public Truck(String color, int maxSpeed, TransmissionType transmission, double price,
                 Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, int cargoWeigh, Country country) throws CarException {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank, country);
        if(cargoWeigh < 0) {
            throw new CarException("Вес груза меньше 0");
        }
        else {this.cargoWeigh = cargoWeigh;}
    }

    public int getCargoWeigh() {
        return cargoWeigh;
    }
}
