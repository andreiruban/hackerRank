package io.ruban.practice.algorithms.warmup.easy;

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuilder sb = new StringBuilder(n * n);
        for (int i = 1; i < n + 1; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append("#");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;
        staircase(n);

    }
}
