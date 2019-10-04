package utap;

public class Main {
    public static void main(String[] args) {
        /* Functions are basic tools for making structured
         * programs: we can divide the code into isolated pieces
         * with specific functionality, which might be used more
         * than once, in different contexts.
         *
         * Functions should be defined outside of any other function,
         * at the "class level". So to see how to define functions,
         * see below, after the ending curly brace for main function.
         *
         *
         * Suppose we want to execute a piece of code to print something
         * to the output, many times with different parameters. The code
         * inside "printStars" function does this job. In order to run
         * this code, we would just call the name of the function as a
         * single statement, passing its parameters inside parentheses,
         * according to its signature:
         */
        printTriangle(5, '*');                          // <- prints 5 lines with '*'

        /* If a function is not of type void, i.e. returns a value, we
         * can also access its output by the same statement:
         */
        String anotherTriangle = getTriangle(5, '*');   // <- stores 5 lines of '*' in a String variable
        System.out.println(anotherTriangle);                          // <- then prints it
    }


    /* To define a function we need to specify it's output type,
     * name and arguments. The output type is "void" here,
     * after which comes the function name, and then a comma-
     * separated list of arguments inside parentheses.
     *
     * (We will talk about the "static" keyword later, just
     * leave it there for now.)
     *
     * A function is defined uniquely by its name, along with
     * it's arguments' names and types. That's why together they
     * are called "the function's signature".
     */
    static void printTriangle(int lines, char character) {      // <- body starts
        /* We put the function's "body" after the signature,
         * between curly braces.
         */
        for (int row = 0; row < lines; row++) {
            for (int y = 0; y < row + 1; y++)
                System.out.print(character + " ");
            System.out.println();
        }
        /* Unlike mathematical functions, output could be
         * of type "void", meaning that the function does
         * not return any value, it rather does its job
         * somewhere out of it's scope; It's just a "side effect"
         * of it's execution. In this example. it is the console's
         * output buffer.
         */
    }                                                           // <- body ends


    static String getTriangle(int lines, char character) {
        // A variable defined inside function's body
        String result = "";
        // is only accessible here

        for (int row = 0; row < lines; row++) {
            for (int y = 0; y < row + 1; y++)
                result = result + character + " ";
            result = result + "\n";
        }
        return result;
    }

    /* Functions can be called by other functions, like what we
     * inside main function.
     * Functions can also call themselves:
     */
    static int fact(int i) {
        if (i != 0)
            return fact( i-1 ) * i;
        else
            return 1;
    }
}
