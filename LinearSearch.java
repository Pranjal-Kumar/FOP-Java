package helloworld;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter values in array:");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the value to be searched:");
        int key = sc.nextInt();
//        int m=n-1;
//        for(int i=m;i>=0;i--){
//            System.out.println(i);
//            if(array[i]==key){
//                System.out.println("Found");
//                System.out.println(m-i);
//                break;
//            }
//        }

        int result=getLinearSearchUnsuccessfulComparisonCount(array,key);
        System.out.println(result);

    }

    public static int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int count=0;
        for(int i=0;i<inputArr.length;i++){
            System.out.println(count + " " + i);

            count=count+1;
            if(key==inputArr[i]){
                return count-1;
            }
        }
        return count;
    }

}
