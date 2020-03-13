package oop.inheritance;

public class Resident implements  IResident {
    @Override
    public float getTaxDiscountRate() {
        return 0;
    }

    @Override
    public float getIncomeTaxRate() {
        return 0;
    }
}
