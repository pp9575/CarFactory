package CarPlant.CarTypes;

import CarPlant.CarParts.*;
import CarPlant.CarTypes.Cabrio;

public class Solara extends Cabrio {
//    Для модели solara характерно наличие мини холодильника (функция охладить напиток)
    private MiniFridge miniFridge = new MiniFridge();

    public Solara(String color, int maxSpeed, TransmissionType transmission, double price,
                  Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank) {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank);
    }

    public MiniFridge getMiniFridge() {
        return miniFridge;
    }
}
