package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // قائمة المنتجات في المخزون
    private List<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // إضافة منتج جديد للمخزون
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter لإرجاع المنتجات (مهم لـ CSV و Main)
    public List<Product> getProducts() {
        return products;
    }

    // عرض المخزون
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n--- Inventory List ---");
        for (Product p : products) {
            System.out.println(
                "Name: " + p.getName() +
                " | Price: " + p.getUnitPrice() +
                " | Amount: " + p.getQuantityOrWeight()
            );
        }
    }
}