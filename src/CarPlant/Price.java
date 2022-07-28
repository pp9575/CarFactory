package CarPlant;

public enum Price {
    CAMRY(10_000),
    SOLARA(12_000),
    HIANCE(15_000),
    DYNA(22_000);

    private double price;

    Price(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
