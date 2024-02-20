package edu.elac;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-02 14:33
 */
public class RomaInteger {


    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        Dictionary<Character, Integer> dict = new Hashtable<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int index = s.length() - 1;
        int sum = dict.get(s.charAt(index));
        index--;
        while (index >= 0) {
            int current = dict.get(s.charAt(index));
            if (current >= dict.get(s.charAt(index + 1))) {
                sum += current;
            } else {
                sum -= current;
            }
            index--;
        }
        return sum;
    }
}