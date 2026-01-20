package inventory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Inventory inventory = new Inventory();
        Employee employee = new Employee("Ahmed");
        Customer customer = new Customer("Ali");

        // 🔹 تحميل البيانات من CSV لو موجودة
        CSVExporter.loadInventory(inventory);

        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add New Product");
            System.out.println("3. Buy Product");
            System.out.println("4. Export Inventory Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // عرض المخزون
                    employee.print(inventory);
                    break;

                case 2:
                    // إضافة منتج جديد
                    System.out.println("Choose product type:");
                    System.out.println("1. Packaged Product");
                    System.out.println("2. Bulk Product");
                    System.out.print("Your choice: ");
                    int type = input.nextInt();
                    input.nextLine(); // تنظيف البافر

                    System.out.print("Enter product name: ");
                    String name = input.nextLine();

                    System.out.print("Enter unit price: ");
                    double price = input.nextDouble();

                    System.out.print("Enter quantity / weight: ");
                    double amount = input.nextDouble();

                    Product product;
                    if (type == 1) {
                        product = new PackagedProduct(name, price, (int) amount);
                    } else {
                        product = new BulkProduct(name, price, amount);
                    }

                    inventory.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;

                case 3:
                    // شراء منتج
                    employee.print(inventory);

                    System.out.print("Enter product name to buy: ");
                    input.nextLine();
                    String buyName = input.nextLine();

                    System.out.print("Enter quantity / weight: ");
                    double buyAmount = input.nextDouble();

                    boolean found = false;
                    for (Product p : inventory.getProducts()) {
                        if (p.getName().equalsIgnoreCase(buyName)) {
                            p.reduceQuantity(buyAmount);
                            customer.addToCart(p);
                            System.out.println("Product added to cart.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    // تصدير تقرير
                    CSVExporter.exportReport(inventory.getProducts());
                    break;

                case 5:
                    // حفظ البيانات قبل الخروج
                    CSVExporter.saveInventory(inventory.getProducts());
                    System.out.println("Data saved successfully. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}