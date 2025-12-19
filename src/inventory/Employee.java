package inventory;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void print(Inventory inventory) {
        System.out.println("Employee: " + name);
        inventory.displayInventory();
    }
}
