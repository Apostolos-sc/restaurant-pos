/**
 * The type Item category.
 */
public class ItemCategory {
    private String categoryName;

    /**
     * Instantiates a new Item category.
     *
     * @param categoryName the category name
     */
    public ItemCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Sets category name.
     *
     * @param categoryName the category name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Gets category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
        return categoryName;
    }
}
