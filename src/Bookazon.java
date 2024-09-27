
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Bookazon() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewBooks() {
        for (Book book : books) {
            book.printBookDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        
        // create books
        bookazon.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addBook(new Book("1984", "George Orwell", 1949, 8.99, true));

        // create users
        ShippingAddress shippingAddress = new ShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        BillingAddress billingAddress = new BillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");
        SilverMember subscription = new SilverMember();
        PlatinumMember subscription2 = new PlatinumMember();
        bookazon.addUser(new User("Alice", subscription, shippingAddress, billingAddress));
        bookazon.addUser(new User("Bob", subscription2, shippingAddress, billingAddress));

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.books.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.books.get(1), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress(new ShippingAddress("999 Main St", "", "Springfield", "IL", "62701", "USA"));
        bookazon.users.get(0).setBillingAddress(new BillingAddress("888 Elm St", "", "Springfield", "IL", "62702", "USA"));

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
        
    }
}
