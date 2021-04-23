package helloworld;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

import java.util.*;

public class Listpolymorphism {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    public static void main(String[] args) {
//        List<String> listOfMarks = new ArrayList<String>();
//        listOfMarks.add("aaaa");
//        listOfMarks.add("bbbb");
//        listOfMarks.add("cccc");
//        listOfMarks.add("dddd");
//        listOfMarks.add("eeee");
//
//        List<String> listOfCity = new LinkedList<String>();
//        listOfCity.add("1111");
//        listOfCity.add("2222");
//        listOfCity.add("3333");
//        listOfCity.add("4444");
//        listOfCity.add("5555");


//        for (Object o : listOfMarks){
//            String marks = (String)o;
//            System.out.println(marks);
//        }
//        printValues(listOfMarks);
//        printValues(listOfCity);
//
//    }
//   static void printValues(List<String> input){
//       System.out.println("In PritnValue function");
//       System.out.println("Forward");
//       int c=0;
//       ListIterator fwdIT = input.listIterator();
//       while(fwdIT.hasNext()){
//        System.out.println(fwdIT.next());
////        c++;
//       }
//       System.out.println(c);
//       while(fwdIT.hasPrevious()){
//        System.out.println(fwdIT.previous());
//       }
//       System.out.println("Backward");
//       ListIterator bkwdIT = input.listIterator(input.size());
//       while(bkwdIT.hasPrevious()){
//           System.out.println(bkwdIT.previous());
//       }

       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       head = null;
       if (n > 0) {
           head = new Node(s.nextInt());
           Node temp = head;
           for (int i = 1; i < n; i++) {
               temp.next = new Node(s.nextInt());
               temp = temp.next;
           }
       }
       int k = s.nextInt();
       System.out.println(search(k));


   }
    static boolean search(int k) {
        // Write your code here
        head = null;
        Node temp = head;
        while(head!=null){

        }



        return false;
    }


    }
}
