/*
 * This is a typical java file, containing a single java class: the "Main class".
 * We will later talk about classes, functions, file hierarchy and many strange things
 * you might see here, but for now, just observe that every java application starts from
 * the "main function" inside the "Main class".
 */
package utap;                                   // <- Package name

public class Main {                             // <- Class definition
    public static void main(String[] args) {    // <- function definition
        /* Variables are basic containers of data.
         * This is how a variable is defined:
         */
        int i;                                  // <- Variable declaration
        /* It consists of a "Type" and a "Name".
         * It says we want to use a variable of
         * type "int" (which stores an "integer"),
         * and we will call this variable "i".
         */

        // To store a value in a variable:
        i = 7;                                  // <- assignment
        /* From now on, we can use the stored
         * value by referring to the name "i".
         * Notice that an assignment of the form
         * "X = E;" means "Evaluate E and assign it to X":
         */
        i = i + 1;                              // i = 8;

        /* We can both declare and assign a
         * variable simultaneously:
         */
        int j = i * 2;                          // <- initialization

        // Java has 8 primitive data types:
        boolean b = false;                      // <- true or false
        byte x = 0;                             // <- one byte integer
        short s = 0;                            // <- two bytes integer
        int k = 0;                              // <- four bytes integer
        long l = 0L;                            // <- eight bytes integer
        float f = 0.0f;                         // <- four bytes decimals
        double d = 0.0d;                        // <- eight bytes decimals
        char c = '\u0000';                      // <- two bytes Unicode character

        /* We can also make new data type from
         * already defined ones, we will discuss
         * this in details later. But there's an
         * easy way to construct list of already
         * defined data types as a variable, it's
         * called an "array".
         */
        int[] list = {1, 5, 12};
        // We can refer to an item of the array by its index:
        j = list[1];                            // <- j = 5

        /* Java has basic arithmetical operations
         * that operate on numeric types (i.e. int,
         * float, short, ...), which evaluate to
         * values of the same type:
         * "+", "*", "-" and "/".
         */
        byte neg = - 1;
        int sum = (i + j) * 5;
        float div = (5.0f - f) / 3.0f;
        /* There are also two "unary" operators for increasing
         * and decreasing a value by one:
         */
        int iPlusOne = i++;
        int jMinusOne = j--;

        // There are also logical operators for booleans:
        // "&&", "||" and "!".
        boolean excludedMiddle = (b || ! b) && false;
        
        /* We can compare numerical values using
         * operators "<", "<=", "==" and "!=".
         * These operators take two numbers of
         * the same numerical type and evaluate
         * to a boolean value:
         */
        boolean areTheyEqual = 1 == 1;
        boolean areTheyNot = 1 != 1;
        boolean trichotomy = (i < j) || (j < i) || (i == j);


        /* Another useful data type is "String". For now,
         * assume string as just an array of chars:
         */
        String hello = "Hello";

        /* There is a specific operator that
         * appends a string to another one:
         */
        String helloWorld = hello + " World!";

        /* There are many ways a java program can
         * communicate with the outer world.
         * A simple one is to print some string
         * to the standard output:
         */
        System.out.println(helloWorld);

        /* What we have wrote so far is executed
         * "sequentially", i.e. when you run this
         * code, "all" statements are executed,
         * exactly "once", in the "order" they are
         * written. This is not always what we want.
         * Often we might want a program to behave
         * differently on different situations.
         * This is done using a "conditional statement":
         * Branching the sequential order of the
         * execution based on a boolean value.
         */
        if (b) { // Only one of these two statements are executed
            System.out.println("b is true.");
        } else {
            System.out.println("b is false.");
        }

        /* Sometimes we want a statement to run more
         * than once. We can do this inside a "loop".
         * There are many ways to implement a loop.
         * Anyways, we're going to need a variable of
         * a numerical type (like an int), to "count"
         * the number of executions. Then a "while"
         * statement can be used to check, in each
         * iteration, if we have reached the total
         * number of executions so far:
         */
        int counter = 0;                                        // <- start from 0
        while (counter < 3) {                                   // <- check each time if we have reached 5
            System.out.println("This is iteration " + counter); // <- do something
            counter = counter + 1;                              // <- count another iteration
        }
        /* You will see this in the output:
         *      This is iteration 0
         *      This is iteration 1
         *      This is iteration 2
         */

        /* We can implement a loop in a simpler and
         * more natural fashion using a "for" statement:
         */
        for (int h = 0; h < 3; h++) {                           // <- set, check and increase the counter
            System.out.println("This is iteration " + h); // <- do something
        }
    }
}
