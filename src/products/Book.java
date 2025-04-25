package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String gener;
    public Book(String title, double price, String id, String author, String gener, String publication) {
        super(title, price, id);
        this.author = author;
        this.gener = gener;
        this.publication = publication;
    }
    @Override
    protected String generated() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generated'");
    }
    public String toString() {
        return super.toString() + " author : " + author + " gener : " + gener + " publication : " + publication;
    }

    
}
