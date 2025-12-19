package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getUnitPrice());
        }
    }
}
