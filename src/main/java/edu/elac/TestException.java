package edu.elac;

import java.util.LinkedList;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-29 21:28
 */

class exc0 extends Exception {

}

class exc1 extends exc0 {

}

public class TestException {



    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);

//        try {
//            throw new exc1();
//        } catch (exc0 e0) {
//            System.out.println("exc0");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
    }


}