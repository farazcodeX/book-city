package products;

public abstract class Product {
    private String title;
    private double price;
    private String id;
    public Product(String name, double price) {
        this.title = name;
        setPrice(price);
        id = generateID();

    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    public String getTitle() {return title;}
    public String getId() {return id;}
    public double getPrice() {return price;}
    public String toString() {
        return "ID : " + id + "  title : " + title + "  price : " + price;
    }

    protected abstract String generateID(); 
}