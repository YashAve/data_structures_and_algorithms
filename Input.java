package javacode;

import java.util.Random;

public class Input {

    public static final Random random = new Random();

    public static int[] getSingleDimensionArray(int size, int start, int end) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(start, end);
        }
        return array;
    }
}
