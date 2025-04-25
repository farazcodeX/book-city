package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;
    private static int counter = 1;
    public Notebook(String name, double price, int pages, boolean isHard) {
        super(name, price);
        this.isHardCover = isHard;
        setPageCount(pages);   
    }
    public void setPageCount(int count) {
        if(count > 1) {
            this.pageCount = count;
        }
    }

    public String toString() {
        return super.toString() + " PageCount : " + pageCount + " hard cover ? " + isHardCover;
    }

    @Override
    protected String generateID() {
        return "2" + String.format("%03d", counter++);
    }


    
}
