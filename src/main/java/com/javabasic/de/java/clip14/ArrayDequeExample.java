package com.javabasic.de.java.clip14;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offer(5);
        arrayDeque.offerFirst(6);
        arrayDeque.offerLast(7);
        System.out.println(arrayDeque);

        arrayDeque.push(8);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.pollLast();
        System.out.println(arrayDeque);

        arrayDeque.remove(0);
        System.out.println(arrayDeque);
    }
}
