package io.ruban.practice.algorithms.warmup.easy;

import java.text.DecimalFormat;
import java.util.Scanner;


public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float pos = 0.0f;
        float neg = 0.0f;
        float zero = 0.0f;
        for (int val : arr) {
            if (val > 0) {
                pos++;
            } else if (val < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        DecimalFormat df = new DecimalFormat("###.######");
        System.out.println(df.format(pos / arr.length));
        System.out.println(df.format(neg / arr.length));
        System.out.println(df.format(zero / arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, -1, -1};

        plusMinus(arr);
    }
}
