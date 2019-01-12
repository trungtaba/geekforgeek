//https://practice.geeksforgeeks.org/problems/maximum-index/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static int maximumIndex(int N, long[] A) {
        int[] minAIndex = new int[N];
        minAIndex[0] = 0;
        for (int i = 1; i < N; i++) {
            minAIndex[i] = (A[i] < A[minAIndex[i - 1]]) ? i : minAIndex[i - 1];
        }
        int[] maxAIndex = new int[N];
        maxAIndex[N - 1] = N - 1;
        for (int i = N - 1; i > 0; i--) {
            maxAIndex[i - 1] = A[i - 1] > A[maxAIndex[i]] ? i - 1 : maxAIndex[i];
        }
        int indexDifferenceMax = 0;
        for (int i = 0, j = 0; i < N && j < N;) {
            if (A[minAIndex[i]] <= A[maxAIndex[j]]) {
                indexDifferenceMax = Math.max(indexDifferenceMax, j - i);
                j++;
            } else {
                i++;
            }
        }
        return indexDifferenceMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Long.parseLong(sc.nextLine());
        while (t > 0) {
            int length = Integer.parseInt(sc.nextLine());
            long[] array = new long[length];
            String[] strings = sc.nextLine().split(" ");
            for (int i = 0; i < length; i++) {
                array[i] = Long.parseLong(strings[i]);
            }
            System.out.println(maximumIndex(length, array));
            t--;
        }
    }
}
