package helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//        return_type function_name(){
//        .............
//        ............
//        .............
//
//        }
public class function {
//    static void printdataonscreen(){
//
//        System.out.println("Hello");
//
//    }
    public static void main(String[] args) {

//           int value = Math.abs(-8);
//           System.out.println(value);
//           int result = Math.max(16,10);
//           System.out.println(result);


//        Scanner scan = new Scanner(System.in);
//        // Enter the two numbers in the input console
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        System.out.print(lcm(number1, number2));


//        String string1 = "Welcome";
//        uppercase(string1);
//        System.out.println(string1);


    }
//    static int print2(int m, int i, int j){
//        System.out.println(m);
//        System.out.println(i);
//        System.out.println(j);
//        return 5;
//    }
//    static String print3(){
//        System.out.println(3);
//        String msg="Hi";
//        return msg;
//    }
//
//    static int max(int a, int b){
//
//        if(a>b){
//            return a;
//        }
//        else {
//            return b;
//        }
//
//    }
//
//    static  boolean equal(String a, String b){
//
//        return false;
//
//    }

//    static int lcm(int a, int b){
//
//        int res, i=2,temp;
//        if(a>b){
//            res = a;
//        }
//        else{
//            res = b;
//        }
//        temp=res;
//        while (res%a!=0||res%b!=0){
//            res = temp * i;
//            i++;
//        }
//        return res;
//
//    }


//    public static String uppercase(String string1) {
//        string1.toUpperCase();
//        return string1;
//    }

    public static void fizzBuzz(int[] numbers) {
        //Write the function body here
        for(int i=0;i<numbers.length;i++){

            if(numbers[i]%3==0&&numbers[i]%5==0){
                System.out.print("FizzBuzz ");
            }
            else if(numbers[i]%5==0){
                System.out.print("Buzz ");
            }
            else if(numbers[i]%3==0){
                System.out.print("Fizz ");
            }
            else{
                System.out.print(numbers[i] + " ");
            }

        }
    }

}
