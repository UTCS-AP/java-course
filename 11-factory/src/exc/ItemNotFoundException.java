package exc;

public class ItemNotFoundException extends Exception {
    private String itemName;

    public ItemNotFoundException(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }
}
