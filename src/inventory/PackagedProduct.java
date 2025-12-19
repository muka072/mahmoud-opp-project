package inventory;

public class PackagedProduct extends Product {
    private int quantity;   

    
    public PackagedProduct(String name, double unitPrice, int quantity) {
        super(name, unitPrice);  // استدعاء الباني الخاص بكلاس الأب (Product)
        this.quantity = quantity;
    }

    @Override
    public double calculateTotal() {
        
        return unitPrice * quantity;
    }

    @Override
    public double getQuantityOrWeight() {
        
        return quantity;
    }

    @Override
    public void reduceQuantity(double amount) {
        
        quantity -= amount;
    }
}
