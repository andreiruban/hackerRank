package io.ruban.practice.algorithms.warmup.easy;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Set<Integer> colors = new HashSet<>();
        for (int value : ar) {
            if (colors.contains(value)) {
                colors.remove(value);
                pairs++;
            } else {
                colors.add(value);
            }
        }

        return pairs;
    }

    public static void main(String[] args) throws IOException {
        int n = 9;
        int[] ar = new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
