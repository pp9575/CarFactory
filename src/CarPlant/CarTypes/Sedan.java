package CarPlant.CarTypes;

import CarPlant.CarParts.*;

public abstract class Sedan extends Car {
    //    Для легковых авто характерно наличие круиз контроля, и возможности включить или выключить его.
    private boolean cruiseControlOn = false;

    public Sedan(String color, int maxSpeed, TransmissionType transmission, double price,
                 Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank) {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank);
    }

    public void switchCruiseControl() {
        if (this.cruiseControlOn) {
            this.cruiseControlOn = false;
            System.out.println("Круиз-контроль выключен");
        } else {
            this.cruiseControlOn = true;
            System.out.println("Круиз-контроль включен");
        }
    }
}
