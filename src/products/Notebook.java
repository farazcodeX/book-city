package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;
    public Notebook(String name, double price, String id, int pages, boolean isHard) {
        super(name, price, id);
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
    protected String generated() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generated'");
    }


    
}
