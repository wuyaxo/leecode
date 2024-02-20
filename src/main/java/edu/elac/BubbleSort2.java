package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-25 15:28
 */
public class BubbleSort2 {

    static void swap(int[] array, int index) {
        int swap;
        swap = array[index + 1];
        array[index + 1] = array[index];
        array[index] = swap;
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 9, 92, 39, 5, 1, 73, 2, 8, 17, 4, 89, 51};
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                ++count;
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(array));
    }

}