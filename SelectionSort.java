package helloworld;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter values in array:");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }

        System.out.println("Unsorted array:");
        printArray(array);

        int first=0;
        int last= n-1;
        SelectionSortUsingMinAndRecursion(array,first,last);
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void SelectionSortUsingMinAndRecursion(int arr[],int first,int last){
        if(first==last){
            return;
        }
        int minIndex=first;

        for (int i=first+1;i<=last;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        int temp=arr[minIndex];
        arr[minIndex]=arr[first];
        arr[first]=temp;
        SelectionSortUsingMinAndRecursion(arr,first+1,last);

    }






}
