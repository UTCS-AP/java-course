package model;

import exc.ItemNotFoundException;
import util.FileHandler;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private static Store theOneInstance;

    public static Store getInstance() throws IOException, ParseException {
        if (Store.theOneInstance == null)
            Store.theOneInstance = new Store();

        return Store.theOneInstance;
    }

    private List<StoreItem> storeItems;

    private Store() throws IOException, ParseException {
        String[][] items = FileHandler.parseWithSpaces("store");
        this.storeItems = new LinkedList<>();
        for(int i = 0; i < items.length; i++) {
            String[] line = items[i];
            try {
                String name = line[0];
                float value = Float.parseFloat(line[1]);
                int amount = Integer.parseInt(line[2]);
                StoreItem newItem = new StoreItem(name, value, amount);
                if(this.storeItems.contains(newItem)) {
                    StoreItem oldItem = this.storeItems.get(this.storeItems.indexOf(newItem));
                    oldItem.addMore(newItem.getAmount());
                } else
                    this.storeItems.add(newItem);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                throw new ParseException("Invalid line: " + (i + 1), 0);
            }
        }
    }

    public List<StoreItem> getStoreItems() {
        return this.storeItems;
    }

    public Item getItem(String itemName) throws ItemNotFoundException {
        StoreItem protoItem = new StoreItem(itemName, 0, 0);
        int itemIdx = this.storeItems.indexOf(protoItem);
        if (itemIdx < 0)
            throw new ItemNotFoundException(itemName);
        else {
            StoreItem item = this.storeItems.get(itemIdx);
            if (item.getAmount() > 0) {
                item.consumeOne();
                return item.getItem();
            } else
                throw new ItemNotFoundException(itemName);
        }
    }

    public void close() throws IOException {
        FileHandler.writeStore(this.toString());
    }

    public String toString() {
        String result = "ITEM\tPRC\tAMT\n";
        for (StoreItem storeItem : this.storeItems)
            result += storeItem.getItem().getName() + "\t" +
                    storeItem.getItem().getValue() + "\t" +
                    storeItem.getAmount() + "\n";
        return result;
    }
}
