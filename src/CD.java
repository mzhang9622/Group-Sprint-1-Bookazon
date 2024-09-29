public class CD extends Media {
    private boolean isAlbum;  // true if the CD is an album, false if not

    public CD(String title, String creator, int yearPublished, double price, boolean isAlbum) {
        super(title, creator, yearPublished, price);
        this.isAlbum = isAlbum;
    }

    public void setAlbum(boolean isAlbum){
        this.isAlbum = isAlbum;
    }

    public boolean isAlbum(){
        return isAlbum;
    }

    @Override
    public void printDetails() {
        System.out.println("Media Type: CD");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Artist: " + this.getCreator());
        System.out.println("Year Published: " + this.getYearPublished());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Album: " + this.isAlbum());
    }

}