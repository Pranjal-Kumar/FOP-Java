package helloworld;
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
//        0,1,1,2,3,5,8,13-----------(n-2)+(n-1)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth term of fibonacci series:");
        int n=input.nextInt();
        int result = 0;
//        result = fibu(n);
//        System.out.println(result);

        System.out.println(fibusingloop(n));

    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int fibu(int n){
        if(n<=1){
            return n;
        }
        int k = fibu(n-1);
        int z = fibu(n-2);
        return k+z;
    }

    public static int fibusingConstantSpace(int input){
        int a=0, b=1, c=input;
        for(int i=2;i<=input;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static int fibusingloop(int input){
        int result=0;
        int fib[]=new int[input+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=input;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[input];
    }


}
