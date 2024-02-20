package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-04 19:45
 */
public class BubbleSort3 {

    public static void main(String[] args) {
        int[] array = {7, 3, 9, 92, 39, 5, 1, 73, 2, 8, 17, 4, 89, 51};
        int count = 0;

        for (int i = array.length - 1; i > 0; i--) {
            boolean isSwaped = false;
            for (int j = 0; j < i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}