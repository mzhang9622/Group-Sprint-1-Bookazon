import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;
    private ArrayList<CartItem> items;
    private Subscription subscription;

    public Order(Cart cart, Subscription subscription, ShippingAddress shippingAdress, BillingAddress billingAdress) {
        this.items = cart.getItems();
        this.subscription = subscription;
        this.shippingAddress = shippingAdress;
        this.billingAddress = billingAdress;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress){
        this.billingAddress = billingAddress;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        this.shippingAddress.printAddress();
        this.billingAddress.printAddress();
        System.out.println("Order Price: $" + calculateTotalPrice());
    }

    public double calculateTotalPrice(){
        double totalPrice = 0.0;


        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        double discount = subscription.getDiscount();
        return totalPrice * (1 - discount); 

    }
}
