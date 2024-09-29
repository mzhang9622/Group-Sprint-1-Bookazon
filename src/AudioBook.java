public class AudioBook extends Media {
    private String narrator;  // Gives the name of the narrator

    public AudioBook(String title, String creator, int yearPublished, double price, String narrator) {
        super(title, creator, yearPublished, price);
        this.narrator = narrator;
    }

    public void setNarrator(String narrator){
        this.narrator = narrator;
    }

    public String getNarrator(){
        return this.narrator;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: Audio Book");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getCreator());
        System.out.println("Year Published: " + this.getYearPublished());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Narrator: " + this.getNarrator());
    }
}