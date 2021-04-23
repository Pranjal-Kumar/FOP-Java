package helloworld;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.util.*;

public class loop {
    public static void main(String[] args) {

//        System.out.print("Helllo");
//        int count = 4;
//        while (count>1){
//            System.out.println(count);
//            count = count-1;
//        }

//
//        int count = 1;
//        do {
//            System.out.println(count);
//            count=count+1;
//        }while(count<4);

//        for(initialize;condition;increment/decrement){}

//        for(int i=2;i<100;i=i*2){
//            if (i==32){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Hi");


//        for(int i=2;i<10;i=i+2){
//            System.out.println(i);
//            if (i==6){
//                continue;
//            }
//            System.out.println("Bye");
//        }
//        System.out.println("Hi");

//        for(int i=2; i<50;i=i*i){
//            if (i==4){
//                System.out.println("Skip");
//                continue;
//            }
//            System.out.println(i);
//
//        }
//        System.out.println("HI");

//
//        int size;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        size=input.nextInt();
//        String arr[] = new String[size];
//        System.out.println("Enter values:");
//        for(int i=0;i<size;i++){
//            arr[i]=input.next();
//        }
//        System.out.println("We took the inputs");
//        for(int i=0;i<size;i++){
//            if(arr[i]=="pranjal"){
//                System.out.println("Hello "+ arr[i]);
//            }
//            System.out.println(arr[i]);
//        }
//        System.out.println("Done");

//      Pyramid question
//        Scanner in =  new Scanner(System.in);
//        int n = in.nextInt();
//        int i, j;
//        int count = 0;
//        for(i=0; i<n; i++)
//        {                                       // 1
//            for (j = 0; j <=i; j++)             // 2 3
//            {                                   // 4 5 6
//                count = count+1;                // 7 8 9 10
//                System.out.print(count + " ");
//            }
//            System.out.println();
//        }


//      Pyramid question
//        int i, j;
//        int n= 5;
//        for(i=0; i<n; i++)                //          *
//        {                                 //         * *
//                                          //        * * *
//            for(j=n-i; j>=0; j--)         //       * * * *
//            {                             //      * * * * *
//                System.out.print(" ");
//            }
//
//            for(j=0; j<=i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//      Pyramid question
//        int i,j;
//        for( i=0; i<5; i++)
//        {
//
//            for( j=2*(5-i); j>=0; j--)        //          *
//            {                                 //        * *
//                System.out.print(" ");        //      * * *
//            }                                 //    * * * *
//                                              //  * * * * *
//            for(j=0; j<=i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//      Program to find minimum value in a 2-D array
//        int array[][] = {{34,23,39,26,49},{92,89,78,21,24}, {50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};
//        int rowSize = 5;
//        int columnSize = 5;
//        int min = array[0][0];
//        for(int i=0;i<rowSize;i++){
//
//            for(int j=0;j<columnSize;j++){
//
//                if(array[i][j]<min){
//                    min=array[i][j];
//                }
//            }
//
//        }
//        System.out.print(min);




//      Program to find HCF to two numbers
//        Scanner scan = new Scanner(System.in);
//        // Enter number 1 in the Input Console
//        int num1 = scan.nextInt();
//        // Enter number 2 in the Input Console
//        int num2 = scan.nextInt();
//
//        int hcf=1;
//        // Write logic
//       for(int i=1;i<=num1&&i<=num2;i++){
//           if(num1%i==0&&num2%i==0){
//               hcf=i;
//           }
//       }
//        System.out.print(hcf);
//        scan.close();



//      Program to print highest number in the power of 2
//        Scanner scan = new Scanner(System.in);
//        // Enter the number
//        int number = scan.nextInt();
//        int result = 2;
//        if(number >= 2) {
//
//            while (result<=number){
//                result = result * 2;
//                if(result>number){
//                    break;
//                }
//
//            }
//        }
//        System.out.print(result/2);



//            int[] array = {29,34,12,45,56,02,43, 19};
//
//            // write code to use the Array function
//
//                Arrays.sort(array);
//            for(int i=0; i<array.length; i++) {
//                System.out.print(array[i] + " ");
//            }


//        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
//
//        String inData;
//        try {
//            inData = stdin.readLine();
//
//
//        }catch(){
//
//        }
//
//
//        System.out.println("You wrote: " + inData);
//

        boolean check = true;
        functionA(check);
        System.out.print(check && !functionA(check));

    }
    public static boolean functionA(boolean a) {
        return !a;
    }

}
