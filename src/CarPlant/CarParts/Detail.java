package CarPlant.CarParts;

public abstract class Detail {
    private boolean isFine;

    public Detail(boolean isFine) {
        this.isFine = isFine;
    }

    public boolean isFine() {
        return isFine;
    }

    public void setFine(boolean fine) {
        isFine = fine;
    }
}
