package products;

public class Accessory extends Product{

    private String color;
    private static int idCounter = 1;

    public Accessory(String name, double price, String color) {
        super(name, price);
        this.color = color;
    
    }
    @Override
    protected String generateID() {
        return "3" + String.format("%03d", idCounter++);
    }
    public String toString() {
        return super.toString() + " Color :  " + color; 
    }

}
