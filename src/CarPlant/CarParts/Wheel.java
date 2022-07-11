package CarPlant.CarParts;

public class Wheel extends Detail {
    private WheelRad wheelRad;

    public Wheel(boolean isFine, WheelRad wheelRad) {
        super(isFine);
        this.wheelRad = wheelRad;
    }

    public WheelRad getWheelRad() {
        return wheelRad;
    }

}
