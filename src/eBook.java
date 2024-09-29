public class eBook extends Media {
    private int eYearPublished;  // the electronic publish year

    public eBook(String title, String creator, int yearPublished, double price, int eYearPublished) {
        super(title, creator, yearPublished, price);
        this.eYearPublished = eYearPublished;
    }

    public void setEYearPublished(int eYearPublished){
        this.eYearPublished = eYearPublished;
    }

    public int getEYearPublished(){
        return this.eYearPublished;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: eBook");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getCreator());
        System.out.println("Year Published: " + this.getYearPublished());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Year Published Electronically: " + this.getEYearPublished());
    }
}