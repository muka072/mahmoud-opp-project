package inventory;

public abstract class Product {
    protected String name;
    protected double unitPrice;

    // Constructor to initialize name and unitPrice
    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // Abstract methods that must be implemented by subclasses
    public abstract double calculateTotal();
    public abstract double getQuantityOrWeight();
    public abstract void reduceQuantity(double amount);

    // Concrete methods (getters)
    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
