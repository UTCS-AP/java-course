package model;

public class Item {
    private String name;
    private float value;

    Item(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public float getValue() {
        return this.value;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Item)
                &&
                this.name.equals(((Item) obj).name);
    }
}