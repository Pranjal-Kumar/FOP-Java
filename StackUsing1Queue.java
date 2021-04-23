package helloworld;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    private Queue<Integer> q = new LinkedList<>();
    private static int cap;

    StackUsing1Queue(int cap){
        this.cap = cap;
    }

//    public int getMin(){
//        if(isEmpty()){
//            System.out.println("Underflow");
//            System.exit(1);
//        }
//        else{
//            return min;
//        }
//        return -1;
//    }

    public void push(int x){
        if(ifFull()){
            System.out.println("Overflow");
            return;
        }
        q.add(x);
        for(int i=1;i<q.size();i++){
            int temp = q.remove();
            q.add(temp);
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return q.remove();
    }

    public int peek(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    public int size(){
        return q.size();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public boolean ifFull(){
        return q.size() == cap;
    }


    public static void main(String[] args) {
        StackUsing1Queue stack = new StackUsing1Queue(10);

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
        System.out.println("Pop: " + stack.pop());

        stack.push(3);
        System.out.println("Size: " + stack.size());


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
