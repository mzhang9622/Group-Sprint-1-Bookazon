public class Book extends Media {
    private String title;
    private String creator;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String creator, int yearPublished, double price, boolean isPaperback) {
        super(title, creator, yearPublished, price);
        this.isPaperback = isPaperback;
    }

    public void setisPaperBack(boolean isPaperback){
        this.isPaperback = isPaperback;
    }

    public boolean isPaperback(){
        return isPaperback;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + creator);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);

    }
}