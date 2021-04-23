package helloworld;
import java.util.*;
public class QueueExmp {
    public static void main(String[] args) {
//        Queue<Integer> todo = new LinkedList<>();
//        todo.add(1);
//        todo.add(12);
//        todo.add(124);
//        todo.add(14);
//        todo.add(11);
//        System.out.println("Top: "+todo.peek());
//        todo.remove();
//        System.out.println("Top: "+todo.peek());

        Queue<Character> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}