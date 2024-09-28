public abstract class Media {
    private String title;
    private String creator;
    private int yearPublished;
    private double price;


    public Media (String title, String creator, int yearPublished, double price) {

        this.title = title;
        this.creator = creator;
        this.yearPublished = yearPublished;
        this.price = price;    
    }

    public String getTitle() {
        return this.title;
    }

    public String getCreator() {
        return this.creator;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setCreator(String newCreator) {
        this.creator = newCreator;
    }

    public void setYearPublished(int newYearPublished) {
        this.yearPublished = newYearPublished;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

}