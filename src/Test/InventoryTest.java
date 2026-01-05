package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.Inventory;
import inventory.PackagedProduct;
import inventory.Product;

public class InventoryTest {

    @Test
    void testAddProductDoesNotCrash() {
        Inventory inventory = new Inventory();
        Product milk = new PackagedProduct("Milk", 2.5, 10);

        assertDoesNotThrow(() -> {
            inventory.addProduct(milk);
        });
    }
}
