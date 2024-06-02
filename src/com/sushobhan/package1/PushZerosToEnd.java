package com.sushobhan.package1;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(arr);
        for (int j : arr) {
            System.out.printf(j + " ");
        }
    }

    static void pushZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
