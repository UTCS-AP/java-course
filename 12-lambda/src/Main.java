import data.IntegerWrapper;
import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<IntegerWrapper> list = new LinkedList<>();
        list.insert(new IntegerWrapper(0));
        list.insert(new IntegerWrapper(2));
        list.insert(new IntegerWrapper(4));

        list.forEach(
                integer -> integer.setValue(integer.getValue() + 1)
        );

        for(IntegerWrapper integerWrapper : list) {
            System.out.println("\t" + integerWrapper.getValue());
        }

        System.out.println(
                list.testWholeList(
                        integer -> (integer.getValue() % 2 == 1)
                )
        );
    }
}
