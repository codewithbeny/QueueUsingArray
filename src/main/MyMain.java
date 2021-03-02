package main;

import implementation.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        Integer [] arr=new Integer[5];
        MyQueue<Integer> queue =new MyQueue<>(arr);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.traverse();
        Integer deleted = queue.dequeue();
        if(deleted != null) {
            System.out.println("Deleted Element-->" +deleted);
        }else{
            System.out.println("Queue Underflow");

        }
        Integer deleted1 = queue.dequeue();
        if(deleted != null) {
            System.out.println("Deleted Element-->" +deleted1);
        }else{
            System.out.println("Queue Underflow");

        }
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.traverse();
    }
}
