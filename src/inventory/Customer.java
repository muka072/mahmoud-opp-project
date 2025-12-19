package inventory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;  
    private List<Product> shoppingList;  

    
    public Customer(String name) {
        this.name = name;
        shoppingList = new ArrayList<>();
    }

    
    public void addToCart(Product product) {
        shoppingList.add(product);
    }

    
    public void print(Inventory inventory) {
        System.out.println("Customer: " + name);
        System.out.println("Receipt:");
        double total = 0;
        for (Product p : shoppingList) {
            System.out.println(p.getName() + " - " + p.calculateTotal());
            total += p.calculateTotal();
        }
        System.out.println("Total: " + total);   
    }
}
