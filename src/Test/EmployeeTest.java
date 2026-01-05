package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import inventory.Employee;
import inventory.Inventory;

public class EmployeeTest {

    @Test
    void testPrintInventoryDoesNotCrash() {
        Inventory inventory = new Inventory();
        Employee emp = new Employee("Ahmed");

        assertDoesNotThrow(() -> {
            emp.print(inventory);
        });
    }
}
