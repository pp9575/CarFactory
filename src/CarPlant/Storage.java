package CarPlant;

import CarPlant.CarTypes.*;

public class Storage {
    private int totalCars = 0;
    private Camry[] camryStorage = new Camry[1000];
    private Dyna[] dynaStorage = new Dyna[1000];
    private Solara[] solaraStorage = new Solara[1000];
    private Hiance[] hianceStorage = new Hiance[1000];

   public int countCamry() {
       int count = 0;
       for (Camry camry : camryStorage) {
           if (camry != null) {
               count++;
           }
       }
       return count;
   }

    public int countDyna() {
        int count = 0;
        for (Dyna car : dynaStorage) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public int countSolara() {
        int count = 0;
        for (Solara car : solaraStorage) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public int countHiance() {
        int count = 0;
        for (Hiance car : hianceStorage) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public void addCar(Car car) throws storageException {
       if (totalCars == 1000) {
           throw new storageException("Склад переполнен");
       }
       if (car instanceof Camry) {
           camryStorage[countCamry()] = (Camry) car;
       } else if (car instanceof Dyna) {
            dynaStorage[countDyna()] = (Dyna) car;
        } else if (car instanceof Solara) {
           solaraStorage[countSolara()] = (Solara) car;
         } else if (car instanceof Hiance) {
           hianceStorage[countHiance()] = (Hiance) car;
        }
        totalCars++;
    }

    public void addCar(Car[] car) throws storageException {
        if (totalCars == 1000 || (totalCars + car.length) > 1000) {
            throw new storageException("Склад переполнен");
        }
         for (Car car1 : car) {
                if (car1 instanceof Camry) {
                    camryStorage[countCamry()] = (Camry) car1;
                } else if (car1 instanceof Dyna) {
                    dynaStorage[countDyna()] = (Dyna) car1;
                } else if (car1 instanceof Solara) {
                    solaraStorage[countSolara()] = (Solara) car1;
                } else if (car1 instanceof Hiance) {
                    hianceStorage[countHiance()] = (Hiance) car1;
                } else if (car1 == null) {
                    continue;
                }
             totalCars++;

         }
    }

    public Camry returnCamry() throws storageException {
       if (totalCars == 0) {
           throw new storageException("Склад пустой");
       } else if (countCamry() == 0) {
           throw new storageException("На складе нет Camry");
       }
       Camry isReturned = camryStorage[countCamry() - 1];
       camryStorage[countCamry()] = null;
       totalCars--;
       return isReturned;
    }

    public Dyna returnDyna() throws storageException {
        if (totalCars == 0) {
            throw new storageException("Склад пустой");
        } else if (countDyna() == 0) {
            throw new storageException("На складе нет Dyna");
        }
        Dyna isReturned = dynaStorage[countDyna() - 1];
        dynaStorage[countDyna()] = null;
        totalCars--;
        return isReturned;
    }

    public Solara returnSolara() throws storageException {
        if (totalCars == 0) {
            throw new storageException("Склад пустой");
        } else if (countSolara() == 0) {
            throw new storageException("На складе нет Solara");
        }
        Solara isReturned = solaraStorage[countSolara() - 1];
        solaraStorage[countSolara()] = null;
        totalCars--;
        return isReturned;
    }

    public Hiance returnHiance() throws storageException {
        if (totalCars == 0) {
            throw new storageException("Склад пустой");
        } else if (countHiance() == 0) {
            throw new storageException("На складе нет Hiance");
        }
        Hiance isReturned = hianceStorage[countHiance() - 1];
        hianceStorage[countHiance()] = null;
        totalCars--;
        return isReturned;
    }

    public int getTotalCars() {
        return totalCars;
    }
}
