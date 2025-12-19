package inventory;

public class BulkProduct extends Product {
    private double weightKg;

    public BulkProduct(String name, double unitPrice, double weightKg) {
        super(name, unitPrice);
        this.weightKg = weightKg;
    }

    @Override
    public double calculateTotal() {
        return unitPrice * weightKg;
    }

    @Override
    public double getQuantityOrWeight() {
        return weightKg;
    }

    @Override
    public void reduceQuantity(double amount) {
        weightKg -= amount;
    }
}

