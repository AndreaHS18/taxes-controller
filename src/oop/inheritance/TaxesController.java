package oop.inheritance;

import java.util.List;

public class TaxesController implements IResident {
    public int estimateTaxIncome(List<Resident> residents) {
        return 0;
    }

    @Override
    public float getTaxDiscountRate() {
        return 0;
    }

    @Override
    public float getIncomeTaxRate() {
        return 0;
    }
}
