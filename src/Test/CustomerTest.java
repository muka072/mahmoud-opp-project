package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.Customer;
import inventory.PackagedProduct;
import inventory.Product;

public class CustomerTest {

    @Test
    void testAddToCartDoesNotCrash() {
        Customer customer = new Customer("Ali");
        Product milk = new PackagedProduct("Milk", 2.5, 10);

        assertDoesNotThrow(() -> {
            customer.addToCart(milk);
        });
    }
}
