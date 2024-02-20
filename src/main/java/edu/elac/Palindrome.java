package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-01 13:59
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int orig = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == orig;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

}