package helloworld;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class EstimatePerformance {
    public static void main(String[] args) {

//        List<Integer> list1 = new ArrayList<Integer>();
//        for(int i=0;i<1000;i++){
//            list1.add(i);
//
//        }
//        List<Integer> list2 = new LinkedList<Integer>();
//        for(int i=0;i<1000;i++){
//            list2.add(i);
//
//        }
//        final long time1 = estimatePerformance(list1);
//        final long time2 = estimatePerformance(list2);
//        System.out.println("Time taken by array list : " + time1);
//        System.out.println("Time taken by linked list : " + time2);
//
//        if(time1>time2){
//            System.out.println("Difference of time : " + (time1-time2));
//            System.out.println("Array list taking more time");
//        }
//        else{
//            System.out.println("Difference of time : " + (time2-time1));
//            System.out.println("Linked list taking more time");
//        }
//
//    }
//    public static long estimatePerformance(List<Integer> list){
//        final long start = System.nanoTime();
//        for(int i=0;i<1000;i++){
////            list.add(0,1);
//            int size = list.size();
////            list.get(size/2);
//            list.remove(0);
//        }
//        final long end = System.nanoTime();
//        return end-start;

//        Scanner s = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++)
//            list.add(s.nextInt());
//        reverseArrayList(list);
//        for (int i = list.size()-1;i>=0;i--)
//            System.out.print(list.get(i) + " ");

//        ArrayList<Float> random = new ArrayList<Float>();
//        random.add(2f);
//        random.add(4f);
//        random.add(5f);
//        random.add(10f);
//        random.add(99.9f);
//        random.add(101f);
//        System.out.println(random.contains(5f));
//        random.remove(3);
//        random.add(3,15f);
//        printArray(random);
//        LinkedList<Float> random1 = new LinkedList<Float>();
//        for(int i = 0; i<5;i++){
//            random1.add(random.get(i));
//        }
//        for(Float r : random){
//            random1.add(r);
//        }
//        System.out.println(random1.get(2));

//        LinkedList<Student5> studentList = new LinkedList<Student5>();
//
//        Student5 s1 = new Student5("Sujit", 1);
//        Student5 s2 = new Student5("Siddharth", 2);
//        Student5 s3 = new Student5("Karanpreet", 3);
//        Student5 s4 = new Student5("Hari", 5);
//        Student5 s5 = new Student5("Tricha", 4);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);
//
//        printStudentList(studentList);

//        iterate(random);
//        printList(random);

//        iterateFwd(random);
//        List<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(1);
//        arrayList.add(2);

//        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while(listIterator.hasNext()) {
//            System.out.print(listIterator.next());
//            listIterator.previous();
//        }

//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();
//        thirdMaxInteger(arr);
//


    }

    static void thirdMaxInteger(int[] arr) {
        // Write your code here
       if(arr.length<=2){
           System.out.println("The array doesn't have a third maximum element");
       }
       else if(aresame(arr)){
           System.out.println("The array doesn't have a third maximum element");
       }
       else {
           Arrays.sort(arr);
           System.out.println(arr[arr.length - 3]);
       }



    }
    public static boolean aresame(int[] arr){
        int first = arr[0];
      for(int i=0;i< arr.length;i++){
          if(arr[0]!=arr[i]) {
              return false;
          }
      }
      return true;
    }


    public static void iterateFwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while(it.hasNext()) {
            it.next();
            System.out.println(it.next());


        }
    }

    public static void printList(List<Float> arr) {
        ListIterator<Float> a = arr.listIterator(arr.size());

        while(a.hasPrevious()){
            System.out.println(a.previous());
        }
    }

    static public void iterate (List<Float> numberList) {
        ListIterator<Float> it = numberList.listIterator(2);
//        it.next();
//        it.next();
        System.out.println(it.next());
    }

//    static void reverseArrayList(ArrayList<Integer> list) {
//        // Write your code here
//        ArrayList<Integer> revlist = new ArrayList<>();
//        for(int i = list.size()-1;i>=0;i--){
//            revlist.add(list.get(i));
//        }
//    }
//    public static void printArray(ArrayList<Float> random) {
//
//        //Complete the method declaration here
//        for(Float r : random){
//            System.out.println(r);
//        }
//
//    }

    public static void printStudentList(LinkedList<Student5> students) {
        for(Student5 s : students) {
            if(students.get(1)!=s) {

                continue;
            }
            else{
                System.out.println(s.getDetails());
                break;
            }
        }
    }


}
class Student5 {
    private final String name;
    private final int rollNumber;


    public Student5(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}


