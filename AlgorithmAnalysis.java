package helloworld;
import java.util.Arrays;
import java.util.Scanner;
public class AlgorithmAnalysis {
    public static void main(String[] args) {
//        int arr[]={11,23,3};
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            count++;
//            if(arr[i]==10){
//                System.out.println("Found It");
//                break;
//            }
//            else if(i==arr.length-1){
//                System.out.println("Not Found");
//            }
//        }
//        System.out.println("Number of times loop execute: " + count);
//
//        find(arr,540,0);
//        System.out.println("Done");

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a positive no: ");
//        int n = sc.nextInt();
//        int value = AlgorithmAnalysis.func(n);
//        System.out.println(value);
//        int num[] = new int[5];
//        for(int i=0; i< 5;i++)
//            num[i]=sc.nextInt();
//        int start=0;
//        int end = num.length-1;
//        boolean answer =palindrome(num, start,end);
//        System.out.println(answer);
//        System.out.println(func1(12));
        factorial2(5);
    }
    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }
    public static void factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
    }
    public static int func1(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func1(n/2);
    }
    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }
    public static boolean palindrome(int[] num, int start,int end) {
        //write the logic here
        if(num.length==0||num.length==1){
            return true;
        }
        if(num[start] != num[end]){
            return false;
        }
        return palindrome(num,start+1,end-1);
    }

//      Finding element using recursion
    public static void find(int arr[],int input,int index){

        if(index>= arr.length){
            System.out.println("Not Found");
            return;
        }
        if(arr[index] == input){
            System.out.println("Found");
            return;
        }

        index=index+1;
        find(arr,input,index);
        System.out.println(index);
    }

    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n-1);
    }

}
