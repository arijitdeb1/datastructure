package com.arijit.stack;

import java.util.Scanner;

public class LinkedListStack {

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        push();
        push();
        push();
        show();
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        pop();
        pop();

    }

    public static void push(){
        Scanner firstObj = new Scanner(System.in);
        System.out.println("Enter Object : ");

        if(head == null && tail == null){
            head = new Node(firstObj.nextInt());
            tail = head;
        }else{
            tail.next = new Node(firstObj.nextInt());
            tail = tail.next;
        }
    }

    public static void show(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void peek(){
        System.out.println(tail.value);
    }

    public static void pop(){
        if(head == null && tail == null){
            System.out.println("stack is empty...");
         }else {
            Node temp = head;
            while (temp.next != null) {
                tail = temp;
                temp = temp.next;
            }
            if (head.next == null && tail.next == null) {
                head = null;
                tail = null;
            } else {
                tail.next = null;
            }
            System.out.println("popped - " + temp.value);
        }
    }

}

class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}
