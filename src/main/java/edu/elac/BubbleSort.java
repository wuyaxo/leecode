package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-17 15:21
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 7, 4, 8, 3, 1};
        int swap;
        System.out.println(Arrays.toString(array));
        int cout = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                }
                cout++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(cout);
    }

}