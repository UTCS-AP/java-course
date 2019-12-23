import data.IntegerWrapper;
import linkedlist.Function;

public class AddOneFunction implements Function<IntegerWrapper> {
    public void doSomethingWith(IntegerWrapper integer) {
        integer.setValue(integer.getValue() + 1);
    }
}
