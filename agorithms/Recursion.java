package javacode.agorithms;

public class Recursion {

    public static int iterativeFactorial(int number) {
        int factorial = 1;

        if (number == 0) {
            return factorial;
        }

        for (int multiplier = factorial; multiplier <= number; multiplier++) {
            factorial *= multiplier;
        }

        return factorial;
    }

    public static int recursiveFactorial(int number) {
        /*breaking condition or the base case,
         this is required for recursion to work properly and not end up in stack overflow
        */
        if (number == 0) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }
}
