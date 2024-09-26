import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private String shippingAddressLine1;
    private String shippingAddressLine2;
    private String shippingAddressCity;
    private String shippingAddressState;
    private String shippingAddressZip;
    private String shippingAddressCountry;
    private String billingAddressLine1;
    private String billingAddressLine2;
    private String billingAddressCity;
    private String billingAddressState;
    private String billingAddressZip;
    private String billingAddressCountry;
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, String subscription) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(subscription);
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.shippingAddressLine1 = line1;
        this.shippingAddressLine2 = line2;
        this.shippingAddressCity = city;
        this.shippingAddressState = state;
        this.shippingAddressZip = zip;
        this.shippingAddressCountry = country;
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.billingAddressLine1 = line1;
        this.billingAddressLine2 = line2;
        this.billingAddressCity = city;
        this.billingAddressState = state;
        this.billingAddressZip = zip;
        this.billingAddressCountry = country;
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

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddressLine1 + ", " + shippingAddressLine2 + ", " + shippingAddressCity + ", " + shippingAddressState + ", " + shippingAddressZip + ", " + shippingAddressCountry);
        System.out.println("Billing Address: " + billingAddressLine1 + ", " + billingAddressLine2 + ", " + billingAddressCity + ", " + billingAddressState + ", " + billingAddressZip + ", " + billingAddressCountry);
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(String subscription) {
        double totalPrice = 0.0;

        // Calculate the total price of the cart items
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        // Get the discount using the factory and apply it
        SubscriptionDiscount discount = SubscriptionDiscountFactory.getDiscount(subscription);
        return discount.calculatePrice(totalPrice);
    }

    // Abstract class for different subscription discounts
    abstract static class SubscriptionDiscount {
        public abstract double calculatePrice(double totalPrice);
    }

    // Gold subscription class
    static class GoldSubscription extends SubscriptionDiscount {
        private static final double GOLD_DISCOUNT = 0.15;

        @Override
        public double calculatePrice(double totalPrice) {
            return totalPrice * (1 - GOLD_DISCOUNT);  // Apply 15% discount
        }
    }

    // Platinum subscription class
    static class PlatinumSubscription extends SubscriptionDiscount {
        private static final double PLATINUM_DISCOUNT = 0.10;

        @Override
        public double calculatePrice(double totalPrice) {
            return totalPrice * (1 - PLATINUM_DISCOUNT);  // Apply 10% discount
        }
    }

    // Silver subscription class
    static class SilverSubscription extends SubscriptionDiscount {
        private static final double SILVER_DISCOUNT = 0.05;

        @Override
        public double calculatePrice(double totalPrice) {
            return totalPrice * (1 - SILVER_DISCOUNT);  // Apply 5% discount
        }
    }

    // No subscription or invalid subscription class (no discount)
    static class NoSubscription extends SubscriptionDiscount {
        @Override
        public double calculatePrice(double totalPrice) {
            return totalPrice;  // No discount applied
        }
    }

    // Factory class to return the appropriate discount object
    static class SubscriptionDiscountFactory {
        public static SubscriptionDiscount getDiscount(String subscription) {
            switch (subscription.toLowerCase()) {
                case "gold":
                    return new GoldSubscription();
                case "platinum":
                    return new PlatinumSubscription();
                case "silver":
                    return new SilverSubscription();
                default:
                    return new NoSubscription();  // No discount for invalid subscriptions
            }
        }
    }
}
