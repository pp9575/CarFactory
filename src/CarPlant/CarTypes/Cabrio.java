package CarPlant.CarTypes;

import CarPlant.CarParts.*;
import CarPlant.Country;

public abstract class Cabrio extends Car {
//    Для кабриолета характерно возможность опустить или поднять крышу ( следовательно и состояние этой крыши)
    private boolean roofOpen = false;

    public Cabrio(String color, int maxSpeed, TransmissionType transmission, double price,
                  Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, Country country) {
        super(color, maxSpeed, transmission, price, electric, engine, wheels, lights, fuelTank, country);
    }

    public void switchRoof() {
        if (this.roofOpen) {
            this.roofOpen = false;
            System.out.println("Крыша закрыта");
        } else {
            this.roofOpen = true;
            System.out.println("Крыша открыта");
        }
    }

}
