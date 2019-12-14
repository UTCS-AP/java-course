import exc.ItemNotFoundException;
import model.Item;
import model.ListItem;
import model.Store;
import model.StoreItem;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            List<ListItem> cart =  new LinkedList<>();
            Store store = Store.getInstance();

            System.out.println("Store supply:");
            Iterator<StoreItem> storeIterator = store.getStoreIterator();
            int i = 0;
            while(storeIterator.hasNext()) {
                StoreItem currentItem = storeIterator.next();
                System.out.println(
                        "\n#" + i + "\nName: " + currentItem.getItem().getName()
                        + "\nPrice: " + currentItem.getItem().getValue()
                        + "\nRemaining: " + currentItem.getAmount()
                        + "\n--------"
                );
                i++;
            }
            System.out.println("\n\nWhat do you want?");

            Scanner scan = new Scanner(System.in);
            String itemName = "";

            while (!itemName.equals("x")) {
                System.out.print("Enter an item's name, or 'x' to exit: ");
                itemName = scan.nextLine();
                try {
                    Item newItem = store.getItem(itemName);
                    ListItem protoItem = new ListItem(newItem, 1);
                    int itemIdx = cart.indexOf(protoItem);
                    if(itemIdx < 0)
                        cart.add(protoItem);
                    else
                        cart.get(itemIdx).oneMore();
                } catch (ItemNotFoundException e) {
                    System.out.println("Seems we've ran out of this one.");
                }
            }

            float grandTotal = 0f;
            System.out.println("Here's your bill:\nNAME\tCNT\tPRC\tTOTAL");
            for(ListItem listItem : cart) {
                grandTotal += listItem.total();
                System.out.println(
                        listItem.getItem().getName() + "\t"
                        + listItem.getCount() + "\t"
                        + listItem.getItem().getValue() + "\t"
                        + listItem.total()
                );
            }
            System.out.println("Grand Totale: " + grandTotal);
            store.close();
        } catch (IOException e) {
            System.err.println("IO Error!");
            e.printStackTrace();
        } catch (ParseException e) {
            System.err.println("Check file format!");
            e.printStackTrace();
        }
    }
}
