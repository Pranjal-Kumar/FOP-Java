package helloworld;
import java.util.*;
public class Linked_list {

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;

        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        Node temp=head;
        for(int i=1;i<5;i++){
            temp.next = new Node(i);
            temp = temp.next;
        }


        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
