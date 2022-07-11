package CarPlant;

import CarPlant.CarParts.*;

public class Runner {
    public static void main(String[] args) {
        Camry camry1 = new Camry("red", 180, TransmissionType.AUTO, 750256.55,
                new Electric(true),new Engine(true), wheelsSet(WheelRad.R17), new Lights(true),
                new FuelTank(12.5));
        camry1.getUsb().turnOnMusic();
        camry1.switchCruiseControl();
        camry1.getWheel(0).setFine(false);
        camry1.getEngine().setFine(false);
        try {
            camry1.start();
        } catch (CarException e) {
            throw new RuntimeException(e);
        }
    }

    public static Wheel[] wheelsSet(WheelRad wheelRad) {
    Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(true, wheelRad);
        }
        return wheels;
    }
}
