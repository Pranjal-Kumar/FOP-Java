package helloworld;

public class Stack {
    private  int arr[];
    private int top;
    private int capacity;
    private  int min;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
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
        if(ifFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        if(isEmpty()){
            min = x;
            arr[++top] = x;
            return;
        }
        System.out.println("Inserting: "+x);
//        arr[++top] = x;
        if(x<min){
            arr[++top] = 2 * x - min;
            min = x;
        }
        else{
            arr[++top] = x;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        System.out.println("Deleting: " + peek());
        return arr[top--];
    }

    public int peek(){
        if(!isEmpty()){
//            return arr[top];
            if(arr[top]<min){
                return min;
            }
            else{
                return arr[top];
            }
        }
        else{
            System.exit(1);
        }
        return -1;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean ifFull(){
        return top == capacity-1;
    }

}

class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(5);
        System.out.println("Min: " + stack.getMin());

        stack.push(10);
        System.out.println("Min: " +stack.getMin());

        stack.push(4);
        System.out.println("Min: " +stack.getMin());

        stack.push(3);
        System.out.println("Min: " +stack.getMin());

        stack.push(2);
        System.out.println("Min: " +stack.getMin());

        stack.push(1);
        System.out.println("Min: " +stack.getMin());

        stack.push(40);
        System.out.println("Min: " +stack.getMin());



//        stack.push(1);
//        stack.push(2);
//
//        stack.pop();
//        stack.pop();
//
//        stack.push(3);
//        System.out.println(stack.peek());
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
