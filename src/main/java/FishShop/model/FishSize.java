package FishShop.model;

import lombok.Getter;

@Getter
public class FishSize {
    protected double lengthInCm;
    protected double widthInCm;


    public FishSize(double lengthInCm, double widthInCm) {
        this.lengthInCm = lengthInCm;
        this.widthInCm = widthInCm;

    }




}
