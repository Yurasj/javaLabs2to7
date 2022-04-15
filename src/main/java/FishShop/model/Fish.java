package FishShop.model;

public class Fish extends FishSize {
    FishCategory category;
    double weightInKilo;
    double priceInHryvnia;

    public Fish(double lengthInCm, double widthInCm, FishCategory category, double weightInKilo, double priceInHryvnia) {
        super(lengthInCm, widthInCm);
        this.category = category;
        this.weightInKilo = weightInKilo;
        this.priceInHryvnia = priceInHryvnia;
    }

    public FishCategory getCategory() {
        return category;
    }

    public double getWeightInKilo() {
        return weightInKilo;
    }

    public double getPriceInHryvnia() {
        return priceInHryvnia;
    }
}

