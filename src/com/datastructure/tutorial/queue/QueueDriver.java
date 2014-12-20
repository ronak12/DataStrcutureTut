package com.datastructure.tutorial.queue;

/**
 * Created by ADMIN on 12/20/2014.
 */
public class QueueDriver {
    public static void main(String[] args) {
        Queue testQueue=new Queue();
        testQueue.enQueue("Ronak");
        testQueue.enQueue("dhatri");
        testQueue.enQueue("Pujan");
        testQueue.enQueue("Hemen");
        testQueue.enQueue("Chetna");
        System.out.println("Front of the Queue is "+testQueue.getFront());
        System.out.print("Rear of the Queue is "+testQueue.getRear());
    }

}

