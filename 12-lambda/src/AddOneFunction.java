import data.IntegerWrapper;
import linkedlist.Function;

/**
 * OBSOLETE
 * (means that it's not used anymore, and probably will be removed)
 */
public class AddOneFunction implements Function<IntegerWrapper> {
    public void doSomethingWith(IntegerWrapper integer) {
        integer.setValue(integer.getValue() + 1);
    }
}
