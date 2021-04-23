package helloworld;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int n = sc.nextInt();
//        int array[]=new int[n];
//        System.out.println("Enter values in array:");
//        for(int i=0;i<n;i++){
//            array[i]= sc.nextInt();
//        }
//        System.out.println("Unsorted array:");
//        printArray(array);
//
//        InsertionSortUsingLoop(array);
//        System.out.println("\nSorted array:");
//        printArray(array);

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }
        String name[]= new String[size+size];
        InsertionSortUsingLoop(firstNames);
        int i,k;
        for( k=0,i=0;i<size;i++){
            name[k]=firstNames[i];
            k++;
        }
        InsertionSortUsingLoop1(lastNames);
        for( int j=0;j<size;j++){
            name[k]=lastNames[j];
            j++;
            k++;
        }
        for (i=0;i<size+size;i++){
            System.out.println(name[i]);
        }

    }

    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void InsertionSortUsingLoop(String arr[]){

        int l = arr.length;

        int j;
        String key;
        for(int i=1;i<l;i++){
            key=arr[i];
            j=i-1;
            while(j>0){
                    if(arr[j-1].compareTo(arr[j])<0) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
            }
            arr[j+1]=key;
        }

    }

    public static void InsertionSortUsingLoop1(String arr[]){

        int l = arr.length;

        int j;
        String key;
        for(int i=1;i<l;i++){
            key=arr[i];
            j=i-1;
            while(j>0){
                if(arr[j-1].compareTo(arr[j])<0) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }

            }
            arr[j+1]=key;
        }

    }

}
