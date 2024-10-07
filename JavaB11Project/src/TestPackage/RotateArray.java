package TestPackage;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(array, k);
        System.out.println("Array after rotating by " + k + " steps: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n;
        
        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

