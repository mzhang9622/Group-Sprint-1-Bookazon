import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> media;
    private ArrayList<User> users;

    public Bookazon() {
        media = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addMedia(Media m) {
        media.add(m);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewMedia() {
        for (Media m : media) {
            m.printDetails();
        }
    }

    public void viewUsers() {
        System.out.println("User Details: ");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + "\nSubscription: " + user.getSubscription());
        }
    }

    public void removeMedia(Media m) {
        media.remove(m);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addMedia(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addMedia(new Book("1984", "George Orwell", 1949, 8.99, true));

        // create other media
        bookazon.addMedia(new CD("The Magic Shop", "BTS", 2018, 12.99, false));
        bookazon.addMedia(new DVD("The Lion King, Part 1", "Walt Disney", 1994, 9.99, false));
        bookazon.addMedia(new eBook("Harry Potter and Chamber of Secrets", "J.K. Rowling", 1998, 10.99, 2015));
        bookazon.addMedia(new AudioBook("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2015, 29.99, "Jim Dale"));

        // create users
        ShippingAddress shippingAddress = new ShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        BillingAddress billingAddress = new BillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        SilverMember silver = new SilverMember();
        RegularMember regular = new RegularMember();

        bookazon.addUser(new User("Alice", silver, cart1, shippingAddress, billingAddress));
        bookazon.addUser(new User("Bob", regular, cart2, shippingAddress, billingAddress));
        
        // see how many users
        bookazon.viewUsers();

        System.out.println();

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.media.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.media.get(1), 2);
        bookazon.users.get(0).addToCart(bookazon.media.get(3), 1);
        bookazon.users.get(0).addToCart(bookazon.media.get(4), 2);

        bookazon.users.get(1).addToCart(bookazon.media.get(2), 3);
        bookazon.users.get(1).addToCart(bookazon.media.get(1), 1);
        bookazon.users.get(1).addToCart(bookazon.media.get(5), 1);
        bookazon.users.get(1).addToCart(bookazon.media.get(6), 1);

        // view cart
        bookazon.users.get(0).viewCart();

        // view cart for other person
        bookazon.users.get(1).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress(new ShippingAddress("999 Main St", "", "Springfield", "IL", "62701", "USA"));
        bookazon.users.get(0).setBillingAddress(new BillingAddress("888 Elm St", "", "Springfield", "IL", "62702", "USA"));

        bookazon.users.get(1).setShippingAddress(new ShippingAddress("4000 Mayflower Hill", "", "Waterville", "ME", "04901", "USA"));
        bookazon.users.get(1).setBillingAddress(new BillingAddress("888 Elm St", "", "Springfield", "IL", "62702", "USA"));

        // Removing some media
        bookazon.users.get(0).removeFromCart(bookazon.media.get(4));

        // checkout
        bookazon.users.get(0).checkout("09/27/2024", "10/01/2024");

        // view order details
        bookazon.users.get(0).viewOrders();

        System.out.println();

        // remove book from cart
        bookazon.users.get(1).removeFromCart(bookazon.media.get(2));

        System.out.println();

        // check order detail
        bookazon.users.get(1).viewCart();;

        // other testing
        System.out.println("\n");



        



        
    }
}
