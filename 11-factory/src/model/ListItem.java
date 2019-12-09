package model;

public class ListItem {
    private Item item;
    private int count;

    public ListItem(Item item, int count) {
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return this.item;
    }

    public int getCount() {
        return this.count;
    }

    public float total() {
        return this.count * this.item.getValue();
    }

    public void oneMore() {
        this.count++;
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ListItem)
                &&
                this.item.equals(  ( (ListItem) obj ).item  );
    }
}
