package javacode;

import javacode.agorithms.Algorithms;
import javacode.agorithms.Recursion;

public class Main {

    public static void main(String[] args) {
        //recursion();
    }

    public static void algorithms() {
        Algorithms.twoSum(Input.getSingleDimensionArray(7, -100, 100), Input.random.nextInt(0, 100));
    }

    public static void recursion() {
        int number = 4;
        System.out.println(number + "! using iteration is equal to " + Recursion.iterativeFactorial(number));
        System.out.println(number + "! using recursion is equal to " + Recursion.recursiveFactorial(number));
    }
}