package javacode;

import java.util.Arrays;

public class Utils {

    public static String deepToString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] outer : array) {
            stringBuilder.append(Arrays.toString(outer)).append("\n");
        }
        return stringBuilder.toString();
    }
}
