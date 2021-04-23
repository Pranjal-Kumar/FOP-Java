package helloworld;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {

//      Syntax : ArrayList variable_name = new ArrayList();
//      Type safe syntax : ArrayList<datatype> variable_name = new ArrayList<data-type>();
//      Add element in ArrayList : variable_name.add(object);

//        ArrayList<String> listOfNames = new ArrayList<String>();
//        listOfNames.add("Pranjal");
//        listOfNames.add("varun");
//        listOfNames.add("vishal");
//        listOfNames.add(1,"Chand Babu");
////        listOfNames.add(100); // not type safe
////        listOfNames.clear(); // it will delete all the elements
//
//        if(listOfNames.contains("varun")){
//            System.out.println("Varun present");
//        }
//        System.out.println(listOfNames.indexOf("Pranjal"));
//        listOfNames.remove("varun");
//        listOfNames.remove(1);
//
//        for(Object o : listOfNames){
//            String name = (String)o;
//            System.out.println(name);
//        }
//
//        ArrayList<Integer> marks = new ArrayList<Integer>();
//        marks.add(100);
//        marks.add(50);



//        Syntax : LinkedList variable_name = new LinkedList();
        LinkedList<String> listOfNames = new LinkedList<String>();
        listOfNames.add("Pranjal");
        listOfNames.add("varun");
        listOfNames.add("vishal");
        listOfNames.add(1,"Chand Babu");

        String[] fixedlistOfNames = new String[listOfNames.size()];

        for(Object o : listOfNames){
            String fixedname = (String)o;
            System.out.println(fixedname);
        }



//        listOfNames.clear(); // it will delete all the elements
        if(listOfNames.contains("varun")){
            System.out.println("Varun present");
        }
//        System.out.println(listOfNames.indexOf("Pranjal"));
//        listOfNames.remove("varun");
//        listOfNames.remove(1);


        for(Object o : listOfNames){
            String name = (String)o;
            System.out.println(name);
        }




    }
}
