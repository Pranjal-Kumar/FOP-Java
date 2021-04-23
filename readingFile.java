package helloworld;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class readingFile {
    public static void main(String[] args) {
//        int i;
//        File file = new File("C:\\Users\\HP\\Desktop\\MUIT Upgrad\\number");
//        Scanner input = new Scanner(file);
//        while (input.hasNextInt()){
//            i = input.nextInt();
//            System.out.println(i);
//        }
//        input.close();

//
//        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
//
//        try  {
//            String inData;
//            inData = stdin.readLine();
//        }catch (Exception ee){
//
//            System.out.println("You wrote: " + inData);
//        }
//        try{
//            //code that may raise exception
//            int data=100/0;
//        }catch(ArithmeticException e){System.out.println(e);}
//        //rest code of the program
//        System.out.println("rest of the code...");

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inData;
            inData = stdin.readLine();
            System.out.println("You wrote: " + inData);
        }catch (Exception ee){
            System.out.print(ee);
        }





    }
}
