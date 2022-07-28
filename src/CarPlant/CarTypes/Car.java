package CarPlant.CarTypes;

import CarPlant.CarParts.*;
import CarPlant.CarException;
import CarPlant.Country;

public abstract class Car {
//    Для всех машин характерны следующие атрибуты: цвет, максимальная скорость, тип коробки передач (акпп, механика,
//    робот), в состоянии движения (да/нет).
//    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
//    Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16, hiance - 20, dyna - 20).
//    Колеса могуть быть заменяемы если они одинакового диаметра.
//    Бензобак имеет атрибут - количество бензина
//    Двигатель имеет атрибут - работоспособен
//    Электрика имеет атрибут - работоспособна
//    Фары имеют атрибут - работоспособны
//    Цена - с центами
    private boolean isMoving = false;
   private String color;
    private int maxSpeed;
    private TransmissionType transmission;
    private double price;
    private Electric electric;
    private Engine engine;
    private Wheel[] wheels;
    private Lights lights;
    private FuelTank fuelTank;
    private Country country;

    public Country getCountry() {
        return country;
    }

    public Car(String color, int maxSpeed, TransmissionType transmission, double price,
               Electric electric, Engine engine, Wheel[] wheels, Lights lights, FuelTank fuelTank, Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.price = price;
        this.electric = electric;
        this.engine = engine;
        this.wheels = wheels;
        this.lights = lights;
        this.fuelTank = fuelTank;
        this.country = country;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Wheel getWheel(int i) {
        return wheels[i];
    }

    public Engine getEngine() {
        return engine;
    }
    //    Начать движение - меняет состояние движения. Начать движение возможно только при: наличии всех колес и они не
//    проколоты, непустом бензобаке, работоспособным электрике и двигателю. Если что то из этого невыполняется, то
//    выкидывается ошибка StartCarException, в сообщении которой содержится причина невозможности движения.
//    Остановить движение - меняет состояние движения. Для остановки не нужно условий.
//    Включить фары - сообщает о работе фар.

    public void start() throws CarException {
        if (!wheelsFine()) {throw new CarException("Проблема с колесами");}
        if (fuelTank.getFuelCount() == 0) {throw new CarException("Нет бензина");}
        if (!engine.isFine()) {throw new CarException("Проблема с двигателем");}
        if (!electric.isFine()) {throw new CarException("Проблема с электрикой");}
        this.isMoving = true;
        System.out.println("Машина поехала");
    }

    public boolean wheelsFine() {
        if (wheels == null) {return false;}
        if (wheels.length != 4) {return false;}
        for (Wheel wheel : wheels) {
            if (!wheel.isFine()) {
                return false;
            }
        }
        return true;
    }

    public void stop() {
        this.isMoving = false;
        System.out.println("Машина остановилась");
    }
    public void switchLight() throws CarException {
        if (!lights.isFine()) {throw new CarException("Проблема с фарами");}
        if (lights.isLightsOn()) {
            lights.setLightsOn(false);
            System.out.println("Фары выключены");
        }
        else {
            lights.setLightsOn(true);
            System.out.println("Фары включены");
        }
    }

    public double getPrice() {
        return price;
    }
}


