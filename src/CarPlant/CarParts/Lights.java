package CarPlant.CarParts;

public class Lights extends Detail {
    private boolean lightsOn = false;

    public Lights(boolean isFine) {
        super(isFine);
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }
}
