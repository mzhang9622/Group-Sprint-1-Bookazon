public class Book extends Media {
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String creator, int yearPublished, double price, boolean isPaperback) {
        super(title, creator, yearPublished, price);
        this.isPaperback = isPaperback;
    }

    public void setPaperBack(boolean isPaperback){
        this.isPaperback = isPaperback;
    }

    public boolean isPaperback(){
        return isPaperback;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: Book");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getCreator());
        System.out.println("Year Published: " + this.getYearPublished());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Paperback: " + this.isPaperback());
    }
}