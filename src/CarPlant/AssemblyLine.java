package CarPlant;

import CarPlant.CarParts.TransmissionType;
import CarPlant.CarParts.WheelRad;
import CarPlant.CarTypes.Camry;
import CarPlant.CarTypes.Dyna;
import CarPlant.CarTypes.Hiance;
import CarPlant.CarTypes.Solara;

public class AssemblyLine {
//    класс, который будет использовать фабрику производств и отдавать нам готовые машины. Например должен быть метод,
//    который принимает в себя два параметра - цвет и цену, а возвращает новую Camry. Необходимо создать 4 метода,
//    которые будут создавать все наши модели: createCamry, createSolara, createHiance, createDyna. Сборочный конвеер
//    может пользоваться только той фабрикой производств, которая находится в той же стране (Подумать где должна
//            происходить эта проверка). Иначе должна появляться ошибка: CountyFactoryNotEqualException - в описании
//    ошибки должны описаться страны которые не совпали.

    private Country country;
    private Fabric fabric;

    public AssemblyLine(Country country, Fabric fabric) throws CountyFactoryNotEqualException {
        this.country = country;
        this.fabric = fabric;
        if (!fabric.getCountry().toString().equals(country.toString())) {
            throw new CountyFactoryNotEqualException("Страна фабрики " + fabric.getCountry().toString() + " не совпадает" +
                    " со страной конвейра " + country.toString());
        }
    }

    public Country getCountry() {
        return country;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public Camry createCamry(String color, double price) {
        int camryMaxSpeed = 195;
        Camry camry = new Camry(color, camryMaxSpeed, TransmissionType.AUTO, price, fabric.createElectric(),
                fabric.createEngine(), fabric.createWheelSet(WheelRad.R17), fabric.createLights(), fabric.createFuelTank(), getCountry());
        return camry;
    }

    public Solara createSolara(String color, double price) {
        int solaraMaxSpeed = 230;
        Solara solara = new Solara(color, solaraMaxSpeed, TransmissionType.ROBOT, price, fabric.createElectric(),
                fabric.createEngine(), fabric.createWheelSet(WheelRad.R16), fabric.createLights(), fabric.createFuelTank(), getCountry());
        return solara;
    }

    public Hiance createHiance(String color, double price) throws CarException {
        int hianceMaxSpeed = 160;
        int hianceCargoWeight = 750;
        Hiance hiance = new Hiance(color, hianceMaxSpeed, TransmissionType.MANUAL, price, fabric.createElectric(),
                fabric.createEngine(), fabric.createWheelSet(WheelRad.R20), fabric.createLights(), fabric.createFuelTank(),
                hianceCargoWeight, getCountry());
        return hiance;
    }

    public Dyna createDyna(String color, double price) throws CarException {
        int dynaMaxSpeed = 140;
        int dynaCargoWeight = 1500;
        Dyna dyna = new Dyna(color, dynaMaxSpeed, TransmissionType.AUTO, price, fabric.createElectric(),
                fabric.createEngine(), fabric.createWheelSet(WheelRad.R16), fabric.createLights(), fabric.createFuelTank(),
                dynaCargoWeight, getCountry());
        return dyna;
    }
}
