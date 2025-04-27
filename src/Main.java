import inventory.Inventory;
import products.*;

public class Main {

    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItems(new Book("Book A", 150.0, "Author1", "Publication1", "Fiction"));
        bookInventory.addItems(new Book("Book B", 200.0, "Author2", "Publication2", "Science"));

        notebookInventory.addItems(new Notebook("Notebook A", 50.0, 200, true));
        notebookInventory.addItems(new Notebook("Notebook B", 30.0, 100, false));

        accessoryInventory.addItems(new Accessory("Accessory A", 20.0, "Red"));
        accessoryInventory.addItems(new Accessory("Accessory B", 25.0, "Blue"));

        // نمایش محصولات
        System.out.println("Books:");
        bookInventory.displayAll();
        System.out.println("\nNotebooks:");
        notebookInventory.displayAll();
        System.out.println("\nAccessories:");
        accessoryInventory.displayAll();

        bookInventory.removeItemById("1001");
        bookInventory.removeItemById("2003");


        accessoryInventory.applyDiscount("Accessory B", 20);

        System.out.println("\nTotal Price of Books: " + bookInventory.calculateTotalPrice());
        System.out.println("Total Price of Notebooks: " + notebookInventory.calculateTotalPrice());
        System.out.println("Total Price of Accessories: " + accessoryInventory.calculateTotalPrice());

        accessoryInventory.displayAll();
    }
}
