/*
 * This is a typical java file, containing a single java class: the "Main class".
 * We will later talk about classes, functions, file hierarchy and many strange things
 * you might see here, but for now, just observe that every java application starts from
 * the "main function" inside the "Main class".
 */
package utap;                                   // <- Package name

import java.util.Scanner;

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
        short residue = 16 % 2;                 // <- calculate the residue; here it is 0``
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
        if (b) // Only one of these two statements are executed
            System.out.println("b is true.");
        else
            System.out.println("b is false.");

        /* What goes inside two curly braces "{" and "}"
         * is called a "block" of code. If we want multiple
         * statements to be executed in a branch of a
         * conditional statement, we can put them in a block.
         */
        int p = 3;
        int q = 0;
        // Suppose we want to divide p by q, only when q is not zero
        if (q != 0) {
            int pByq = p / q;
            System.out.println("Result is: " + pByq);
        } else
            System.out.println("Can't divide by zero!");

        /* We can write anything inside the conditional block,
         * even another conditional statement:
         */
        if (i % 2 == 0) {
            System.out.println("i is even.");
            if (i % 5 == 0)
                System.out.println("It is also a factor of 10.");
        }


        /* Sometimes we want a statement to run more
         * than once. We can do this inside a "loop".
         * There are many ways to implement a loop.
         * Anyways, we're going to need a variable of
         * a numerical type (like an int), to "count"
         * the number of executions. Then a "while"
         * statement can be used to repeat and check,
         *  in each iteration, if we have reached the
         *  total number of executions so far:
         */
        int counter = 0;                                        // <- start from 0
        while (counter < 3) {                                   // <- check each time if we have reached 5
            System.out.println("Count " + counter); // <- do something
            counter = counter + 1;                              // <- count another iteration
        }
        /* You will see this in the output:
         *      Count 0
         *      Count 1
         *      Count 2
         */

        /* We can implement a loop in a simpler and
         * more natural fashion using a "for" statement:
         */
        for (int h = 0; h < 3; h++)                       // <- set, check and increase the counter
            System.out.println("This is iteration " + h); // <- do something

        /* Every thing inside a loop block will be executed
         * as many times the loop condition is satisfied.
         * even another loop.
         * So, suppose a statement inside a loop is executed n
         * times. How many times it will be executed if we put
         * the loop inside another loop that iterates m times?
         * m * n
         */
        for (int firstLevel = 0; firstLevel < 5; firstLevel++) {
            for (int secondLevel = 0; secondLevel < 2; secondLevel++)
                System.out.print("(" + firstLevel + ", " + secondLevel + ") ");  // <- "print" does not go to a new line
            System.out.println();                         // <- "println" goes to a new line
        }
        /* It will print this:
         *      (0, 0) (0, 1)
         *      (1, 0) (1, 1)
         *      (2, 0) (2, 1)
         *      (3, 0) (3, 1)
         *      (4, 0) (4, 1)
         */

        // It is possible to dynamically set the loop bound
        for (int row = 0; row < 5; row++) {
            for (int y = 0; y < row + 1; y++)
                System.out.print("* ");
            System.out.println();
        }
        /* This will output:
         *      *
         *      * *
         *      * * *
         *      * * * *
         *      * * * * *
         */

        /* Finally, let's see a more complex example that
         * summarizes what we learned, and also shows how
         * to get input from user.
         *
         * First, it shows a prompt; informing user
         * that we are waiting for their input:
         */
        System.out.println("What should I call you?");
        /* Finally, getting input from the user needs
         * a "scanner", which is defined like this:
         */
        Scanner scan = new Scanner(System.in);
        // Then we use the scanner to get a String from user
        String name = scan.nextLine();                          // <- this line blocks the execution
        System.out.println("Nice to meet you.\n" +
                "So what do you think " + name + "?\n" +
                "\t1) I think.\n" +
                "\t2) I think not.");
        int option = 0;
        while (option != 1 && option != 2) {
            System.out.print("Please choose '1' or '2':");
            // we can use the same scanner more than once, this time to get an int
            option = scan.nextInt();
        }
        if (option == 1)
            System.out.println("I used to know someone called " + name + " who thought alike.");
        else
            System.out.println("Me too!");
    }
}
