package com.datastructure.tutorial.queue;

/**
 * Created by ADMIN on 12/20/2014.
 */
public class QueueDriver {
    public static void main(String[] args) {
        Queue testQueue=new Queue();
        testQueue.enQueue("1");
        testQueue.enQueue("2");
        testQueue.enQueue("3");
        testQueue.enQueue("4");
        testQueue.enQueue("5");
        System.out.println("Front of the Queue is "+testQueue.getFront());
        System.out.print("Rear of the Queue is "+testQueue.getRear());
    }

}

