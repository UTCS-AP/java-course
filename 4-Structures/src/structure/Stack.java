package structure;

import data.Person;
//    to another class in a different package.

/**
 * A simple fixed-size stack structures, for objects of type {@code Person}.
 */
public class Stack {
    /** A default size to use when the input size is inappropriate */
    static final private int DEFAULT_SIZE = 10;

    /** The FIXED size of the stack */
    final private int size;             // <- The "final" keyword makes a variable "immutable", so
                                        //    once initialized, it will keep its value, forever.

    /** Last Person's index + 1 (0 when stack is empty) */
    private int topIdx = 0;

    /** The actual list of Persons */
    private Person[] list;


    /**
     * Creates a new stack of the given size, only if it's not negative.
     * @param size the fixed size of the stack
     */
    public Stack(int size) {
        if (0 <= size)
            this.size = size;
        else
            this.size = Stack.DEFAULT_SIZE;
        this.list = new Person[this.size];
    }

    /**
     * Pushes another Person to the stack, only if there is room left.
     * @param person the Person to be pushed
     * @return true if pushed successfully, false otw.
     */
    public boolean push(Person person) {
        if (this.topIdx < this.size) {
            this.list[topIdx] = person;
            this.topIdx++;
            return true;
        } else
            return false;
    }

    /**
     * Pops the last pushed Person from the stack.
     * @return the person at the top, if the stack is not empty, null otw.
     */
    public Person pop() {
        if (0 < this.topIdx)
            return this.list[--this.topIdx];
        else
            return null;
    }
}
