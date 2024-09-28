
import java.util.ArrayList;
import java.util.concurrent.Flow.Subscription;

public class User {
    private String name;
    private Subscription subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;

    public User(String name, Subscription subscription, Cart cart, ShippingAddress shippingAddress, BillingAddress billingAddress) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = cart;
        this.orders = new ArrayList<>();
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(ShippingAddress shippingAddress){
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress){
        this.billingAddress = billingAddress;
    }

    public void addToCart(Book book, int quantity) {
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Book book) {
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(book.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout(String dateCreated, String dateShipped) {
        Order order = new Order(cart, subscription, this.shippingAddress, this.billingAddress);
        order.setOrderStatus("Order Placed");
        order.setDateCreated(dateCreated);
        order.setDateShipped(dateShipped);
        order.setUserName(this.name);
        orders.add(order);
    }
}


