package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.Product;
import inventory.PackagedProduct;

public class ProductTest {

    @Test
    void testCalculateTotal() {
        Product product = new PackagedProduct("Milk", 2.5, 10);
        assertEquals(25.0, product.calculateTotal());
    }

    @Test
    void testGetName() {
        Product product = new PackagedProduct("Milk", 2.5, 10);
        assertEquals("Milk", product.getName());
    }

    @Test
    void testGetUnitPrice() {
        Product product = new PackagedProduct("Milk", 2.5, 10);
        assertEquals(2.5, product.getUnitPrice());
    }
}
