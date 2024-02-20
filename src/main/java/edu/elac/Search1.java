package edu.elac;

/**
 * <p>
 *
 * @description: BinarySearch
 * </p>
 * @author: David
 * @create: 2024-01-25 14:06
 */
public class Search1 {

    static int binarySearch(int[] array, int target) {
        //int index
        int l = 0;
        int r = array.length - 1;
        int index = (l + r) / 2;
        while (l < r) {
            if (array[index] == target) {
                return index;
            } else if (array[index] < target) {
                l = index;
            } else {
                r = index;
            }
            index = (l + r) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(array1, 8));
    }


}