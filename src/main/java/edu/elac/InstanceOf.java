package edu.elac;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-29 11:46
 */
public class InstanceOf {

    static class A {

    }

    static class B extends A {

    }

    static class C extends B {

    }

    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b instanceof C);
//        Integer[] nums = {1, 2, 3};
//        LinkedList<Integer> lst = new LinkedList<>();
//
//        Arrays.sort(nums, Collections.reverseOrder());
//        boolean b = false;
//        if (b = true) {
//            System.out.println("hello");
//        } else {
//            System.out.println("GoodBye");
//        }

//        ArrayList<String> list = new ArrayList<>();
//        list.add("ABC");
//        list.add("ABC");
//        list.add("ABC");
//        list.add("ABC");
//        list.add("BC");
//
//        Set<String> set = list.stream().collect(Collectors.toSet());
//
//        set.forEach(System.out::println);
//
//        Queue<String> queue = new LinkedList<>();;
//        queue.poll();

//        Deque<String> dq= new ArrayDeque<>();

        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        minQueue.add(15);
        minQueue.add(10);
        minQueue.add(100);
        minQueue.add(30);
        minQueue.add(40);

        for (int i = 1; i <=5; i++) {
            System.out.println(minQueue.peek());
            minQueue.poll();
        }

    }


}