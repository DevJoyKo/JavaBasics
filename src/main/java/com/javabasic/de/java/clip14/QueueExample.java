package com.javabasic.de.java.clip14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(3);
        queue.add(5);
        System.out.println(queue);
        System.out.println("first element:"+queue.peek());
        System.out.println(queue.size());
        System.out.println("first element:"+queue.poll());
        System.out.println(queue.size());
        System.out.println("first element:"+queue.peek());


        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        System.out.println(queue);

        for(int element: queue){
            System.out.println("queue item: "+element);
        }

        int lastOffsetQueue = queue.size();
        for(int i=0;i< lastOffsetQueue;i++){
            System.out.println("queue: "+ queue.poll());
        }
        System.out.println("isEmpty: " +queue.isEmpty());
    }
}
