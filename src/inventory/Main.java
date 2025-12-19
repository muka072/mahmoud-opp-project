package inventory;

public class Main {
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        
        Product milk = new PackagedProduct("Milk", 2.5, 10);
        Product rice = new BulkProduct("Rice", 1.8, 20);   

       
        inventory.addProduct(milk);
        inventory.addProduct(rice);

        
        Employee emp = new Employee("Ahmed");
        emp.print(inventory);   
         
        Customer cust = new Customer("Ali");
        cust.addToCart(milk);  
        cust.print(inventory);  
    }
}
