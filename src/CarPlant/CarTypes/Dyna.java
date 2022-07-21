package CarPlant.CarTypes;

import CarPlant.CarException;
import CarPlant.CarParts.*;
import CarPlant.CarTypes.Truck;
import CarPlant.Country;

public class Dyna extends Truck {
//    Для модели dyna характерно наличие розетки (функция зарядить телефон)
    private PowerOutlet powerOutlet = new PowerOutlet();

    public Dyna(String color, int maxSpeed, TransmissionType transmission, double price,
                Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, int cargoWeigh,
                Country country) throws CarException {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank, cargoWeigh, country);
    }

    public PowerOutlet getPowerOutlet() {
        return powerOutlet;
    }
}
