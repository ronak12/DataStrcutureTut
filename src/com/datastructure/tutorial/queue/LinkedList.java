package com.datastructure.tutorial.queue;

/**
 * Created by ADMIN on 1/3/2015.
 */
public class LinkedList {

    public LinkedList(String item) {
        this.head = new Node(item);
        head.next=null;
    }

    private static class Node{
        private String item;
        private Node next;

        public Node(String item, Node next) {
            this.item = item;
            this.next = next;
        }

        public Node(String item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item='" + item + '\'' +
                    ", next=" + next +
                    '}';

        }
    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addNode(String item){
           Node newNode=new Node(item);
            if(this.head==null){

                this.head=newNode;
            }else{
                Node tempNode=this.head;
                while(tempNode.next!=null){
                    tempNode=tempNode.next;
                }
                tempNode.next=newNode;

            }
    }

    @Override
    public String toString() {
        StringBuffer string=new StringBuffer();
        Node tempNode=this.head;
        while(tempNode!=null){

            string.append(tempNode.item);
            string.append("-->");
            tempNode=tempNode.next;

        }
        return string.toString();
    }
}
