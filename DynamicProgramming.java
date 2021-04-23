package helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth term of fibonacci series:");
        int n=input.nextInt();
        int dpMemory[] = new int[n+1];
        Arrays.fill(dpMemory,-1);
        System.out.println(fibonacciUsingDP(n,dpMemory));
//        fibUsingTabulation(n);
    }

    public static int fibonacciUsingDP(int n,int dpMemory[]){
        if(n<=1){
            dpMemory[n] = n;
            return n;
        }
        if(dpMemory[n]!=-1){
            return dpMemory[n];
        }
        int finalAns = fibonacciUsingDP(n-1,dpMemory)+fibonacciUsingDP(n-2,dpMemory);
        dpMemory[n] = finalAns;
        return finalAns;
    }

    public static int fibUsingTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int fibUsingConstantSpace(int input){
        int a = 0, b = 1, c = input;
        for(int i=2;i<=input;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}
