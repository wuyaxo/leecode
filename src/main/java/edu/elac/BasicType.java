package edu.elac;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-29 20:32
 */
public class BasicType {

    public static void main(String[] args) {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad ");
        }
    }


}