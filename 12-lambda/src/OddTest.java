import data.IntegerWrapper;
import linkedlist.Tester;

public class OddTest implements Tester<IntegerWrapper> {
    public boolean test(IntegerWrapper integer) {
        return (integer.getValue() % 2 == 1);
    }
}
