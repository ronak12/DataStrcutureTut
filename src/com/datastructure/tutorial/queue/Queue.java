package com.datastructure.tutorial.queue;

/**
 * Created by ADMIN on 12/20/2014.
 */
public class Queue {

    private Node front;
    private Node rear;

    private  static class Node{
        private String item;
        private Node next;

        @Override
        public String toString() {
            return this.item;
        }
    }



    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }

    public boolean enQueue(String item){
        if(front==null && rear==null){
            Node temp=new Node();
            temp.item=item;
            temp.next=null;
            front=rear=temp;
            return true;

        }else{
           Node newNode=new Node();
            newNode.item=item;
            newNode.next=null;
            rear.next=newNode;
            rear=rear.next;
            return true;
        }
    }
    public boolean deQueue(){
        if(front==null && rear==null){
           return false;
        }else if(front==rear)
        {
            front=rear=null;
            return true;
        } else{
            Node temp=front;
            front=temp.next;
            return true;
        }
    }

    public boolean isEmpty(){
        return front==null;
    }
}
