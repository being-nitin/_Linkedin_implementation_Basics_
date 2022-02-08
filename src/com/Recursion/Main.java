package com.Recursion;
import java.util.*;
public class Main {
    private Node head;
    private Node tail;
    private int size;
    public Main(){
        this.size = 0;
    }
    // Now inserting at the last position.
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }
    public int deleteFirst(){
        int val =  head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            insertLast(value);
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next =node;
        size++;
    }
    public int deleteLast(){
       if(size<=1){
           return deleteFirst();
       }
       Node secondLast = get(size-2);
       int val = tail.value;
       tail = null;
       return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void insertFirst(int value){
        /*
        now inserting a node in a linkedlist. if we insert it from first place then the head will be the element
        which will be inserted and the node.next will be the element which was head before insertion.
         */
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size = size+1;
    }
    /*
    Taken a third variable temp which will be equal to head so till it becomes null display of content
    will be continued.
     */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    private class Node{
        // value = value that is given in a node
        // Node = it will point to the next node.
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}