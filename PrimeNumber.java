package helloworld;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number:");
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
