package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-31 10:57
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{22, 89, 32, 93, 47, 72, 20, 29, 0};

//        int[] array = new int[9];
//        for (int i = 0; i < array.length - 1; i++) {
//            array[i] = (int) (Math.random() * 100);
//        }
//        System.out.println(Arrays.toString(array));

        int length = array.length;
        int[] temp = new int[length];
        mergeSortHelper(array, temp, 0, length - 1);
        System.out.println(Arrays.toString(array));
    }


    private static void mergeSortHelper(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortHelper(array, temp, low, mid);
            mergeSortHelper(array, temp, mid + 1, high);
            merge(array, temp, low, mid, high);
        }
    }

    private static void merge(int[] array, int[] temp, int low, int mid, int high) {
        System.out.println(String.format("low:%s,mid:%s, high:%s", low, mid, high));
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