import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;

public class Main {
    public static void main(String[] args) {
            // Inventory for each type
            Inventory<Book> bookInventory = new Inventory<>();
            Inventory<Notebook> notebookInventory = new Inventory<>();
            Inventory<Accessory> accessoryInventory = new Inventory<>();
    
            // Add products
            bookInventory.addItems(new Book("Java Basics", 150.0, "John Doe", "TechPress", "Programming"));
            bookInventory.addItems(new Book("Design Patterns", 200.0, "Gamma", "O'Reilly", "Software"));
    
            notebookInventory.addItems(new Notebook("Notebook A", 30.0, 100, true));
            notebookInventory.addItems(new Notebook("Notebook B", 25.0, 80, false));
    
            accessoryInventory.addItems(new Accessory("Mouse", 50.0, "Black"));
            accessoryInventory.addItems(new Accessory("Keyboard", 100.0, "White"));
    
            // Remove one item
    
            // Find items by ID

            bookInventory.findItemsById("9999"); // Not found
    
            // Apply discount
            bookInventory.applyDiscount("Design Patterns", 10);
            accessoryInventory.applyDiscount("Mouse", 20);
    
            // Display all
            System.out.println("Books:");
            bookInventory.displayAll();
            System.out.println("\nNotebooks:");
            notebookInventory.displayAll();
            System.out.println("\nAccessories:");
            accessoryInventory.displayAll();

    }
}
