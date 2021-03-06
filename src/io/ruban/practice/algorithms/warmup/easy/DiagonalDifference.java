package io.ruban.practice.algorithms.warmup.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRight = 0;
        int rightToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(arr.size() - i - 1);
        }

        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(0, Arrays.asList(11, 2, 4));
        arr.add(1, Arrays.asList(4, 5, 6));
        arr.add(2, Arrays.asList(10, 8, -12));
        System.out.println(arr);

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
