import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
        System.out.println("\n");
    }
    
    public ArrayList<CartItem> getItems() {
        return items;
    }
}
