import data.IntegerWrapper;
import linkedlist.Function;
import linkedlist.LinkedList;
import linkedlist.Tester;

public class Main {
    public static void main(String[] args) {
        LinkedList<IntegerWrapper> list = new LinkedList<>();
        list.insert(new IntegerWrapper(0));
        list.insert(new IntegerWrapper(2));
        list.insert(new IntegerWrapper(4));

        list.doThisWithWholeList(
                new AddOneFunction()
        );

        IntegerWrapper integerWrapper;
        int i = 0;
        integerWrapper = list.get(0);
        while (integerWrapper != null) {
            System.out.println("\t" + integerWrapper.getValue());
            integerWrapper = list.get(++i);
        }

        System.out.println(
                list.testWholeList(
                        new OddTest()
                )
        );
    }
}
