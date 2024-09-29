public class DVD extends Media {
    private boolean hasBloopers;  // true if the book is paperback, false if it is hardcover

    public DVD(String title, String creator, int yearPublished, double price, boolean hasBloopers) {
        super(title, creator, yearPublished, price);
        this.hasBloopers = hasBloopers;
    }

    public void setHasBloopers(boolean hasBloopers){
        this.hasBloopers = hasBloopers;
    }

    public boolean hasBloopers(){
        return hasBloopers;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: DVD");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Producer: " + this.getCreator());
        System.out.println("Year Published: " + this.getYearPublished());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Bloopers: " + this.hasBloopers());
    }
}