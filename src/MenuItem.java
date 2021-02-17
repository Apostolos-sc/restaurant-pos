/**
 * The type Menu item.
 */
public class MenuItem {
    private double price;
    private String name;
    private ItemCategory menuItemCategory;

    /**
     * Instantiates a new Menu item.
     *
     * @param price            the price
     * @param name             the name
     * @param menuItemCategory the menu item category
     */
    public MenuItem(double price, String name, ItemCategory menuItemCategory) {
        this.price = price;
        this.name = name;
        this.menuItemCategory = menuItemCategory;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets menu item category.
     *
     * @param menuItemCategory the menu item category
     */
    public void setMenuItemCategory(ItemCategory menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets menu item category.
     *
     * @return the menu item category
     */
    public ItemCategory getMenuItemCategory() {
        return menuItemCategory;
    }
}
