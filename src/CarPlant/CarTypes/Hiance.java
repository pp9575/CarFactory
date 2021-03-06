package CarPlant.CarTypes;

import CarPlant.CarException;
import CarPlant.CarParts.*;
import CarPlant.Country;

public class Hiance extends Truck {
//    Для модели hiance характерно наличие запасного колеса
    Wheel extraWheel = new Wheel(true, WheelRad.R20);

    public Hiance(String color, int maxSpeed, TransmissionType transmission, double price,
                  Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, int cargoWeigh,
                  Country country) throws CarException {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank, cargoWeigh, country);
    }
}