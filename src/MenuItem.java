public class MenuItem {
    private double price;
    private String name;
    private ItemCategory menuItemCategory;

    public MenuItem(double price, String name, ItemCategory menuItemCategory) {
        this.price = price;
        this.name = name;
        this.menuItemCategory = menuItemCategory;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenuItemCategory(ItemCategory menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public ItemCategory getMenuItemCategory() {
        return menuItemCategory;
    }
}
