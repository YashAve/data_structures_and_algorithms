package javacode.agorithms;

import java.util.Arrays;

public class Algorithms {

    /*1. Two Sum
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    public static void twoSum(int[] input, int target) {
        System.out.printf("Input: %s with target %d%n", Arrays.toString(input), target);

        int[] output = {-1, -1};
        boolean found = false;

        for (int i = 0; !found && i < input.length; i++) {
            output[0] = -1;

            int sum = input[i];

            if (sum < target) {
                output[0] = i;
                for (int j = i + 1; !found && j < input.length; j++) {
                    if (input[j] + sum == target) {
                        output[1] = j;
                        found = true;
                    }
                }
            }
        }

        System.out.print("Output: ");

        if (output[0] != -1 && output[1] != -1) {
            System.out.printf("input[%d, %d] added up to the target %d%n", output[0], output[1], target);
            return;
        }

        System.out.println("no matches were found");
    }

    /*796. Rotate String
      Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
      A shift on s consists of moving the leftmost character of s to the rightmost position.
      For example, if s = "abcde", then it will be "bcdea" after one shift.
    */

    public static void rotateString(String input, String goal) {

        boolean same = false;
        boolean equal = input.length() != goal.length();
        char[] characters = input.toCharArray();

        for (int i = 0; equal && i < characters.length; i++) {
            if (new String(characters).equals(goal)) {
                same = true;
                break;
            }
            char value = characters[0];
            for (int j = 0; j < characters.length - 1; j++) {
                characters[j] = characters[j + 1];
            }
            characters[characters.length - 1] = value;
        }

        System.out.printf("%s when rotated, %s contain %s%n", input, same ? "does" : "does not", goal);
    }

    public static <T> void palindrome(T input) {

        boolean string = false;
        if (input instanceof String) {
            string = true;
        }

        String variable = string ? (String) input : String.valueOf(input);

        boolean same = true;
        for (int i = 0, last = variable.length() - 1; i < variable.length() / 2; i++, last -= i) {
            if (variable.charAt(i) != variable.charAt(last)) {
                same = false;
                break;
            }
        }

        System.out.printf("%s is %s palindrome%n", variable, same ? "a" : "not a");
    }

    public static void createPalindrome(int input) {
        if (input == 1) {
            System.out.println(1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < input; i++) {
            stringBuilder.append(i);
        }
        stringBuilder.append(input);
        for (int i = input - 1; i > 0; i--) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
