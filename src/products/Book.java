package products;

public class Book extends Product{

    private String author;
    private String publication;
    private String gener;
    private static int counter = 1;
    
    public Book(String title, double price, String author, String gener, String publication) {
        super(title, price);
        this.author = author;
        this.gener = gener;
        this.publication = publication;
    }
    @Override
    protected String generateID() {
        return "1" + String.format("%03d", counter++);
    }
    public String toString() {
        return super.toString() + " author : " + author + " gener : " + gener + " publication : " + publication;
    }

    
}
