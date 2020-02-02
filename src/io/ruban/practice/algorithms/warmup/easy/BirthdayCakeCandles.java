package io.ruban.practice.algorithms.warmup.easy;

import java.io.IOException;
import java.util.Scanner;

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static long birthdayCakeCandles(long[] ar) {
        long heightCandles = 0;
        long maxHeight = 0;
        for (long current : ar) {
            if (current > maxHeight) {
                maxHeight = current;
                heightCandles = 1;
            } else if (current == maxHeight) {
                heightCandles++;
            }
        }

        return heightCandles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        long result = birthdayCakeCandles(ar);

        System.out.println(result);
        scanner.close();
    }
}
