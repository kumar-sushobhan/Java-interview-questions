package com.sushobhan;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int a[], int low, int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 8, 6, 4, 9, 1, 23, 12, 54};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int low = 2;
        int high = 1;
        int key = 9;

        System.out.println(binarySearch(a, low, high, key));
    }
}
