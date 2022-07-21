package CarPlant;

import CarPlant.CarParts.*;
import CarPlant.CarTypes.Camry;
import CarPlant.CarTypes.Car;
import CarPlant.CarTypes.Dyna;
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
            AssemblyLine russianLine1 = new AssemblyLine(Country.CHINA, fabricChina);
            AssemblyLine russianLine2 = new AssemblyLine(Country.RUSSIA, fabricRussia);
            Solara solara = russianLine1.createSolara("red", 15000);


            Storage storage = new Storage();
            storage.addCar(solara);
            Car[] carsArray = new Car[700];
            for (int i = 0; i < 200; i++) {
                carsArray[i] = russianLine1.createCamry("yellow", 25000);
            }
            for (int i = 200; i < 500; i++) {
                carsArray[i] = russianLine2.createHiance("red", 35000);
            }
            storage.addCar(carsArray);

            System.out.println("Количество Машин на складе " + storage.getTotalCars());
            System.out.println("Camry на складе " + storage.countCamry());
            System.out.println("Hiance на складе " + storage.countHiance());
            System.out.println("Solara на складе " + storage.countSolara());
            System.out.println(carsArray[300].getCountry());
            System.out.println(carsArray[100].getCountry());


            } catch (Throwable ex) {
            System.out.println(ex.getMessage());

        }
    }
        }

