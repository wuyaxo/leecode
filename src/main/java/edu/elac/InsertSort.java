package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-04 19:59
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {7, 3, 9, 92, 39, 5, 1, 73, 2, 8, 17, 4, 89, 51};
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            insertElement(array, i);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertElement(int[] array, int i) {
        int card = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > card) {
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = card;
    }
}