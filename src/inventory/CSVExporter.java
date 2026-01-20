package inventory;

import java.io.*;
import java.util.List;

public class CSVExporter {

    private static final String FILE_NAME = "inventory.csv";

    // 1️⃣ حفظ البيانات في CSV (Data Saver)
    public static void saveInventory(List<Product> products) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            writer.println("Name,UnitPrice,QuantityOrWeight,Type");

            for (Product p : products) {
                String type = p instanceof PackagedProduct ? "PACKAGED" : "BULK";

                writer.println(
                        p.getName() + "," +
                        p.getUnitPrice() + "," +
                        p.getQuantityOrWeight() + "," +
                        type
                );
            }

        } catch (IOException e) {
            System.out.println("Error saving inventory to CSV.");
        }
    }

    // 2️⃣ تحميل البيانات من CSV (Persistence)
    public static void loadInventory(Inventory inventory) {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line = reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                double price = Double.parseDouble(data[1]);
                double quantity = Double.parseDouble(data[2]);
                String type = data[3];

                Product product;
                if (type.equals("PACKAGED")) {
                    product = new PackagedProduct(name, price, (int) quantity);
                } else {
                    product = new BulkProduct(name, price, quantity);
                }

                inventory.addProduct(product);
            }

        } catch (IOException e) {
            System.out.println("Error loading inventory from CSV.");
        }
    }

    // 3️⃣ Export Report
    public static void exportReport(List<Product> products) {
        System.out.println("\n===== INVENTORY REPORT =====");
        for (Product p : products) {
            System.out.println(
                    p.getName() + " | Price: " +
                    p.getUnitPrice() + " | Amount: " +
                    p.getQuantityOrWeight()
            );
        }
    }
}