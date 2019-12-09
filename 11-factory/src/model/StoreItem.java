package model;

public class StoreItem {
    private Item item;
    private int amount;

    StoreItem(String itemName, float itemPrice, int amount) {
        this.item = new Item(itemName, itemPrice);
        this.amount = amount;
    }

    Item getItem() {
        return this.item;
    }

    int getAmount() {
        return this.amount;
    }

    void addMore(int amount) {
        this.amount += amount;
    }

    void consumeOne() {
        this.amount--;
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof StoreItem)
                &&
                this.item.equals(  ( (StoreItem) obj ).item  );
    }
}