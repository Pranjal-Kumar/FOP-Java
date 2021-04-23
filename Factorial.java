package helloworld;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = input.nextInt();
        System.out.println("Factorial of "+n+"is : "+fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
