package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.BulkProduct;

public class BulkProductTest {

    @Test
    void testWeightReduction() {
        BulkProduct product = new BulkProduct("Rice", 1.8, 20);
        product.reduceQuantity(5);
        assertEquals(15, product.getQuantityOrWeight());
    }

    @Test
    void testTotalCalculation() {
        BulkProduct product = new BulkProduct("Rice", 1.8, 10);
        assertEquals(18.0, product.calculateTotal());
    }
}
