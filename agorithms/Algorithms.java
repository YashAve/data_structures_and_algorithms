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

    public static void rotateStringEquals(String input, String goal) {

        boolean same = false;
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {
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
}
