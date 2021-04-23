package helloworld;

public class QueueImpl {
    private  int arr[];
    private int capacity;
    private int front;
    private int rear;
    private int min;

    QueueImpl(int size){
        arr = new int[size];
        capacity = size;
        front = rear = 0;
    }

    public void add(int x){
        if(ifFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        if(isEmpty()){
            min = x;
            arr[rear] = x;
            rear++;
            return;
        }
        if(x < min){
            arr[rear] = x;
            min = x;
            rear++;
        }
        else {
            arr[rear] = x;
            rear++;
        }
    }

    public int remove(){
        int a = 0;
        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        else{
            a = arr[front];
            front++;
        }
        return a;
    }

    public int peek(){
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return -1;
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

    public boolean ifFull(){
        return rear == capacity;
    }

    public  boolean isEmpty(){
        return front == rear;
    }

    public int size(){
        return rear;
    }

}

class main1{
    public static void main(String[] args) {
        QueueImpl q = new QueueImpl(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        System.out.println(q.getMin());

    }
}
