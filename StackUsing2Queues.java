package helloworld;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class StackUsing2Queues {
    private  int arr[];
    private int top;
    private int capacity;
    private  int min;

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private static int size;
    private static int cap;

    StackUsing2Queues(int cap){
        size = 0;
        this.cap = cap;
    }

    public int getMin(){
        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        else{
            return min;
        }
        return -1;
    }

    public void push(int x){
        if(size == cap+1){
            System.out.println("Overflow");
            return;
        }
        q2.add(x);
        size++;
    }

    public int pop(){
        int temp = 0;
        if(q2.isEmpty()){
            return -1;
        }
        while(!q2.isEmpty()){
            temp  =q2.remove();
            if(q2.isEmpty()) {
                q1.add(temp);
            }
        }
        Queue<Integer> q = q2;
        q2 = q1;
        q1 = q;
        size--;
        return temp;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return q2.isEmpty();
    }

    public boolean ifFull(){
        return top == capacity-1;
    }


    public static void main(String[] args) {
        StackUsing2Queues stack = new StackUsing2Queues(5);

//        stack.push(5);
//        System.out.println("Min: " + stack.getMin());
//
//        stack.push(10);
//        System.out.println("Min: " +stack.getMin());
//
//        stack.push(4);
//        System.out.println("Min: " +stack.getMin());
//
//        stack.push(3);
//        System.out.println("Min: " +stack.getMin());
//
//        stack.push(2);
//        System.out.println("Min: " +stack.getMin());
//
//        stack.push(1);
//        System.out.println("Min: " +stack.getMin());
//
//        stack.push(40);
//        System.out.println("Min: " +stack.getMin());



        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());

//
//        if(stack.isEmpty()){
//            System.out.println("Stack is Empty");
//        }
//        else{
//            System.out.println("Stack is not Empty");
//        }
//
//        if(stack.ifFull()){
//            System.out.println("Stack is Full");
//        }
//        else{
//            System.out.println("Stack is not Full");
//        }

    }

}
