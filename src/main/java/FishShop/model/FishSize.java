package FishShop.model;

public class FishSize {
    protected double lengthInCm;
    protected double widthInCm;


    public FishSize(double lengthInCm, double widthInCm) {
        this.lengthInCm = lengthInCm;
        this.widthInCm = widthInCm;

    }

    public double getLengthInCm() {
        return lengthInCm;
    }

    public double getWidthInCm() {
        return widthInCm;
    }



}
