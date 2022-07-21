package CarPlant.CarTypes;

import CarPlant.CarParts.*;
import CarPlant.CarTypes.Sedan;
import CarPlant.Country;

public class Camry extends Sedan {
//    Для модели camry характерно наличие usb (функция подключить музыку)
    private USB usb = new USB();

    public Camry(String color, int maxSpeed, TransmissionType transmission, double price,
                 Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, Country country) {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank, country);
    }

    public USB getUsb() {
        return usb;
    }
}
