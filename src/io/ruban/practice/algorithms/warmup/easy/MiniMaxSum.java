package io.ruban.practice.algorithms.warmup.easy;

import java.util.Arrays;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        Arrays.sort(arr);
        long min = Arrays.stream(Arrays.copyOf(arr, arr.length - 1)).sum();
        long max = Arrays.stream(Arrays.copyOfRange(arr, 1, arr.length)).sum();

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        long[] arr = new long[]{
                7, 5, 3, 1, 9
        };
        miniMaxSum(arr);
    }
}
