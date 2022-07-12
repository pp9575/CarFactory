package CarPlant;

import CarPlant.CarParts.*;
import CarPlant.CarTypes.Camry;
import CarPlant.CarTypes.Solara;

public class Runner {
    public static void main(String[] args) {
//                                          ДЗ 1
//        Camry camry1 = new Camry("red", 180, TransmissionType.AUTO, 750256.55,
//                new Electric(true),new Engine(true), wheelsSet(WheelRad.R17), new Lights(true),
//                new FuelTank(12.5));
//        camry1.getUsb().turnOnMusic();
//        camry1.switchCruiseControl();
//        camry1.getWheel(0).setFine(false);
//        camry1.getEngine().setFine(false);
//        try {
//            camry1.start();
//        } catch (CarException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static Wheel[] wheelsSet(WheelRad wheelRad) {
//        Wheel[] wheels = new Wheel[4];
//        for (int i = 0; i < wheels.length; i++) {
//            wheels[i] = new Wheel(true, wheelRad);
//        }
//        return wheels;
//        ------------------------------------------------------------------------------------------------------
//                                             ДЗ 2
        Fabric fabricChina = new Fabric(Country.CHINA);
        Fabric fabricRussia = new Fabric(Country.RUSSIA);

        try {
            AssemblyLine russianLine1 = new AssemblyLine(Country.RUSSIA, fabricChina);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }

        try {
            AssemblyLine russianLine2 = new AssemblyLine(Country.RUSSIA, fabricRussia);
            Solara solara = russianLine2.createSolara("red", 15000);
            solara.getFuelTank().setFuelCount(50);

            try {
                solara.start();
            } catch (CarException e) {
                System.out.println(e.getMessage());
            }
        } catch (CountyFactoryNotEqualException e) {
            throw new RuntimeException(e);
        }

    }
}
