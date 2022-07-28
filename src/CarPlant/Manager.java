package CarPlant;

import CarPlant.CarTypes.Car;

import static CarPlant.Price.*;

public class Manager {

//    Создать Менеджера: он ожидает нового покупателя, и за его сумму предлагает купить машину.
//        У менеджера есть метод - продать машину клиенту: возвращается самая дорогая машина,
//        которую может купить покупатель со своей суммой денег из имеющихся. Если машин на складе нет, то
//        идет запрос на сборку и производство по ценам выше, и машина заносится на склад.
//        Если клиенту не хватает денег, то никакую машину он не получает.
    private Storage storage;
    private AssemblyLine assemblyLine;
    private Customer customer;

    public Manager(Storage storage, AssemblyLine assemblyLine) {
        this.storage = storage;
        this.assemblyLine = assemblyLine;
    }

    public Car sellCar(Customer customer) {

        if (customer.getMoney() >= DYNA.getPrice()) {
            if(storage.countDyna() > 0){
               return storage.returnDyna();
            } else {
               return assemblyLine.createDyna("black", DYNA.getPrice());
            }
        } else if (customer.getMoney() >= HIANCE.getPrice()) {
            if(storage.countHiance() > 0){
                return storage.returnHiance();
            } else {
                return assemblyLine.createHiance("black", HIANCE.getPrice());
            }
        } else if (customer.getMoney() >= SOLARA.getPrice()) {
            if(storage.countSolara() > 0){
                return storage.returnSolara();
            } else {
                return assemblyLine.createSolara("white", SOLARA.getPrice());
            }
        } else if (customer.getMoney() >= CAMRY.getPrice()) {
            if(storage.countCamry() > 0){
                return storage.returnCamry();
            } else {
                return assemblyLine.createCamry("black", CAMRY.getPrice());
            }
        } else {
            return null;

        }
        }
}
