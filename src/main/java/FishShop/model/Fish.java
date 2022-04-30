package FishShop.model;

import lombok.Getter;

@Getter
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
    public boolean compareToAnotherFish(final Fish fish){
        return (this.lengthInCm == fish.lengthInCm && this.widthInCm == fish.widthInCm &&
                this.category== fish.category && this.weightInKilo == fish.weightInKilo && this.priceInHryvnia == fish.priceInHryvnia);
    }

}

