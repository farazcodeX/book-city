package inventory;

import java.util.HashMap;
import java.util.Map;

import products.Product;

public class Inventory<T extends Product> {
    private Map<String, T> items = new HashMap<>();

    public void addItems(T t) {
        items.put(t.getId(), t);
    }
    public T findItemsById(String id) {
        if(items.containsKey(id)) {
            System.out.println("Item ID  : " + id + " found");
            return items.get(id);
        }
        System.out.println("Item : ID  " + id + " not found");
        return null;
    }
    public void applyDiscount(String productName, int discount) {
        items.values().stream().filter(item -> item.getTitle().equalsIgnoreCase(productName)).forEach(item -> item.setPrice(item.getPrice() * (1 - discount / 100.0)));
    }
    public void displayAll() {
        items.values().stream().forEach(item -> System.out.println(item.toString()));
    }
    public double calculateTotalPrice() {
        return items.values().stream().mapToDouble(item -> item.getPrice()).sum();
    }
    public void removeItemById(String id) {
        if(items.containsKey(id)) {
            items.remove(id);
            System.out.println("Itmem ID : " + id + " removed successfully");
        } else {
            System.out.println("item id : " + id + " not found");
        }
    }

}
