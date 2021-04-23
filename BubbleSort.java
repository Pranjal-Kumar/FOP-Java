package helloworld;
import java.util.*;
public class BubbleSort {
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

        for(int i=0;i<n;i++){
            int swap=0;
            for(int j=1;j<n-1;j++){
                if(array[j-1]>array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
        System.out.println("\nSorted array:");
        printArray(array);
//
//        int M = sc.nextInt();
//        int size=sc.nextInt();
//        int array[]=new int[size];
//
//        totalBubbleSortSwaps(array,M);
//
//        for(int i=0;i<size;i++){
//            array[i]= sc.nextInt();
//        }
//        int result = totalBubbleSortSwaps(array,M);
//       System.out.println(result);
//        for(int i=0;i<size;i++){
//            System.out.println(array[i]);
//        }


    }

        static int totalBubbleSortSwaps ( int[] array, int M){
            int size = array.length;
            int steps = 0;
            int totalSwaps = 0;
            for (int i = 0; i < 3; i++) {

                for (int j = 1; j < size; j++) {
                    if (array[j - 1] < array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        totalSwaps = totalSwaps + 1;
                    }
                }
                steps = steps + 1;
                if (totalSwaps == 0) {
                    break;
                }
            }

            return steps;
        }


        public static void printArray ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void BubbleSort ( int arr[], int size){
            if (size == 1) {
                return;
            }

            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
            BubbleSort(arr, size - 1);
        }
}

