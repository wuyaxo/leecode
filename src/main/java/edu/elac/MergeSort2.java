package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-31 15:50
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] array = new int[]{22, 89, 32, 93, 47, 72, 20, 29, 0};
        int[] temp = new int[array.length];
        divide(array, temp, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void divide(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            divide(array, temp, low, mid);
            divide(array, temp, mid + 1, high);
            merge(array, temp, low, mid, high);
        }
    }

    private static void merge(int[] array, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }

}