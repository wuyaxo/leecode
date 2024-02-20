package edu.elac;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-12 10:55
 */
public class StaticBlock {

    public static void main(String[] args) {
        A ab = new B();
//        ab = new A();
    }

}

class A {
    {
        System.out.println("non-static block");
    }
    private int i = test();
    private static int j = method();

    static {
        System.out.println("static block");
    }

    A() {
        System.out.println("2");
    }



    public int test() {
        System.out.println("non-static private member viable initiate");
        return 1;
    }

    public static int method() {
        System.out.println("static member viable initiate");
        return 1;
    }
}

class B extends A {

    private int i = test();
    private static int j = method();

    static {
        System.out.println("override non-static private member viable initiate");
    }

    B() {
        System.out.println("7");
    }

    {
        System.out.println("8");
    }

    public int test() {
        System.out.println("9");
        return 1;
    }

    public static int method() {
        System.out.println("10");
        return 1;
    }
}