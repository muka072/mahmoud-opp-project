package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.PackagedProduct;

public class PackagedProductTest {

    @Test
    void testQuantityReduction() {
        PackagedProduct product = new PackagedProduct("Milk", 2.5, 10);
        product.reduceQuantity(3);
        assertEquals(7, product.getQuantityOrWeight());
    }

    @Test
    void testTotalAfterReduction() {
        PackagedProduct product = new PackagedProduct("Milk", 2.5, 10);
        product.reduceQuantity(2);
        assertEquals(20.0, product.calculateTotal());
    }
}
