package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-02 15:21
 */
public class MergeSortArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i <= m - 1 && j <= n - 1) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;

            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i <= m - 1) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j <= n - 1) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        for (i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{-50, -48, -47, -47, -46, -44, -43, -43, -41, -39, -38, -37, -37, -37, -33, -33, -32, -31, -29,
                -29, -27, -26, -26, -26, -25, -25, -24, -24, -23, -22, -22, -22, -18, -17, -17, -14, -14, -11, -11, -11, -6, -5,
                -5, -5, -5, -4, -1, 0, 2, 2, 2, 2, 5, 6, 7, 7, 9, 10, 13, 13, 14, 14, 18, 21, 21, 21, 22, 24, 24, 24, 25, 26, 26,
                29, 29, 29, 30, 30, 31, 31, 32, 33, 34, 34, 34, 35, 38, 40, 41, 42, 43, 44, 44, 46, 46, 47, 47, 48, 49, 49};
        int[] nums2 = new int[]{};
        merge(nums1, 100, nums2, 0);
    }

}