package helloworld;
import java.util.*;
public class exceptionHandeling {
    public static void main(String[] args) {


//        System.out.println("Trying to divide 1 by 0");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=in.nextInt();
        int b=in.nextInt();

        int r = 0;
        try {

            if(b==0){
                throw new ArithmeticException("This can't be used");
            }
            r=a/b;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Number");
        }catch (ArithmeticException ae){
//            ae.printStackTrace();
            System.out.println("Invalid");
        }finally {
            System.out.println("Division Done");
        }
        System.out.println(r);
        System.out.println("Done");



    }
}
