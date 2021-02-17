/**
 * The type Order.
 */
public class Order {
    private MenuItem[] orderItems;

    /**
     * Instantiates a new Order.
     */
    public Order() {
    }

    /**
     * Get order items menu item [ ].
     *
     * @return the menu item [ ]
     */
    public MenuItem[] getOrderItems() {
        return orderItems;
    }

    /**
     * Sets order items.
     *
     * @param orderItems the order items
     */
    public void setOrderItems(MenuItem[] orderItems) {
        this.orderItems = orderItems;
    }
}
