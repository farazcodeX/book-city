package products;

public abstract class Product {
    private String title;
    private double price;
    private String id;
    public Product(String name, double price, String id) {
        this.title = name;
        setPrice(price);
        setId(id);
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    public void setId(String id) {
        if(id.length() == 4) {
            this.id = id;
        }
    }
    public String toString() {
        return "ID : " + id + "  title : " + title + "  price : " + price;
    }
    
    protected abstract String generated(); 
}