import data.IntegerWrapper;
import linkedlist.Tester;

/**
 * OBSOLETE
 * (means that it's not used anymore, and probably will be removed)
 */
public class OddTest implements Tester<IntegerWrapper> {
    public boolean test(IntegerWrapper integer) {
        return (integer.getValue() % 2 == 1);
    }
}
