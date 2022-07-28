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

//        У нас уже есть машины, которые могут храниться на складах!
//                Теперь нам необходимо создать дилерскую сеть, которая будет продавать машины!
//                Для этого нам потребуется:
//        Создать склад, производство и сборку в Японии.
//        1. Создать 4 модели машины: camry 10000 black, solara 12000 white, hiance 15000 black, dyna 22000 black.
//        2. Занести их в склад.
//        2. Создать покупателя, у которого мы задаем сумму денег, на которую он может купить машину, а так же его имя
//        3. Создать Менеджера: он ожидает нового покупателя, и за его сумму предлагает купить машину.
//        У менеджера есть метод - продать машину клиенту: возвращается самая дорогая машина,
//        которую может купить покупатель со своей суммой денег из имеющихся. Если машин на складе нет, то
//        идет запрос на сборку и производство по ценам выше, и машина заносится на склад.
//        Если клиенту не хватает денег, то никакую машину он не получает.
//        4. Создать кассира: кассир принимает заказ - берет машину, и заносит в общий для всех кассиров счет доходов.
//
//        В первый день придет 8 покупателей.
//        у первого будет 10000 - уйдет с камри, которая в наличии
//        у второго будет 12000 - уйдет с камри, которая в наличии
//        у третьего будет 15000 - уйдет с камри, которая в наличии
//        у четвертого будет 22000 - уйдет с камри, которая в наличии
//        у пятого будет 11000 - уйдет с камри, из производства
//        у шестого будет 13000 - уйдет с соларой, из производства
//        у седьмого будет 8000 - уйдет ни с чем
//        у восьмого будет 30000 - уйдет с дюной, из производства
//
//        Процесс продажи:
//        Создается менеджер
//        Создается покупатель №1
//        Менеджер принимает покупателя №1 и возвращает машину
//        Кассир принимает машину для продажи и заносит в счет проданную машину
//        ...
//        Создается покупатель №2 и начинается снова продажа машин
//        В конце выводится сумма проданных машин

        Fabric japanFabric = new Fabric(Country.JAPAN);
        Storage japanStorage = new Storage();
               AssemblyLine japanAssembly = new AssemblyLine(Country.JAPAN, japanFabric);

            japanStorage.addCar(japanAssembly.createCamry("black", 10_000));
            japanStorage.addCar(japanAssembly.createSolara("white", 12_000));
            japanStorage.addCar(japanAssembly.createHiance("black", 15_000));
            japanStorage.addCar(japanAssembly.createDyna("black", 22_000));

            Manager manager = new Manager(japanStorage, japanAssembly);

            Cashier cashier = new Cashier();
            Customer[] customers = {new Customer("Петр", 10_000),
                                    new Customer("Константин", 12_000),
                                    new Customer("Юрий", 15_000),
                                    new Customer("Павел", 22_000),
                                    new Customer("Никита", 11_000),
                                    new Customer("Иван", 13_000),
                                    new Customer("Порфирий", 8_000),
                                    new Customer("Скрудж", 30_000)};
            for (var customer:
                 customers) {
                cashier.getMoney(manager.sellCar(customer));
                customer.buyCar(manager.sellCar(customer));
            }
            System.out.println(cashier.getTotal());
        }
        }




