package CarPlant;

import CarPlant.CarParts.*;

public class Fabric {
//    класс, в котором будут методы создающие все наши детали в работоспособном состоянии, (бензобак должен быть
//    пустой). У завода должнен быть атрибут - страна( ведь заводов может быть много). Подумать, какой тип данных у
//    атрибута Страна.
    private Country country;

    public Fabric(Country country) {
        this.country = country;
    }

    public Electric createElectric() {
        return new Electric(true);
    }
    public Engine createEngine() {
        return new Engine(true);
    }
    public FuelTank createFuelTank() {
        return new FuelTank(0);
    }
    public Lights createLights() {
        return new Lights(true);
    }
    public MiniFridge createFridge() {
        return new MiniFridge();
    }
    public PowerOutlet createOutlet() {
        return new PowerOutlet();
    }
    public TransmissionType createTransmission (String type) throws CarException {
        for (TransmissionType value : TransmissionType.values()) {
            if (type.equalsIgnoreCase(value.toString())) {
                return value;
            }
        }
        throw new CarException("Нет такого типа коробки");
    }
    public USB createUSB() {
        return new USB();
    }
    public Wheel createOneWheel(WheelRad wheelRad) {
        return new Wheel(true, wheelRad);
    }
    public Wheel[] createWheelSet(WheelRad wheelRad) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(true, wheelRad);
        }
        return wheels;
    }

    public Country getCountry() {
        return country;
    }
}
