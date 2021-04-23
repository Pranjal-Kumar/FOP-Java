package helloworld;
import  java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        String arr1[]=new String[size];
        System.out.println("Enter values in array:");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextLine();
        }
        quickSort(arr1,0, arr1.length-1);
        for(String x:arr1){
            System.out.println(x);
        }

//        Arrays.sort(arr);

    }
    public static void quickSort(String arr[], int left, int right){
        if(left<right){
            int pivot=partition(arr,left,right);
//            left sub problem
            quickSort(arr,left,pivot-1);
//            right sub problem
            quickSort(arr,pivot+1,right);
        }
    }
    public static int partition(String arr[],int left,int right){
//        select a pivot
        String pivot=arr[right];

//        set left and right elements
        int i = (left-1);
        for(int j=left;j<right;j++){
            if(arr[j].length()<pivot.length()){
                i++;
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;

//        return pivot index
        return (i+1);
    }

}
