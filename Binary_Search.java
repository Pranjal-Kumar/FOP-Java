package helloworld;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Binary_Search br = new Binary_Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter values in array in ascending order:");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the value to be searched:");
        int key = sc.nextInt();
        int first=0;
        int last=n-1;
//        br.binarySearch(array,first,last,key);
        br.binarySearch(array,first,last,key);

//        Source bs = new Source();
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int array[] = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int key = scanner.nextInt();
//        int first=0;
//        int last=size;
//        System.out.println(getBinarySearchUnsuccessfulComparisonCount(array, key,first,last));


    }

    public  static int getBinarySearchUnsuccessfulComparisonCount(int[] array, int key, int first, int last) {

        int mid = (first + last) / 2;
        int count = 1;
        while (first <= last) {

            if (array[mid] == key) {
                break;
            } else if (array[mid] < key) {
                first = mid + 1;
                count=count+1;
            } else {
                last = mid - 1;
                count=count+1;
            }
            mid = (first + last) / 2;

        }

        return count;
    }

    public static void binarySearch(int array[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if (array[mid] == key){
                System.out.println("Element found at : " + mid);
                break;
            }
            else if (array[mid]<key){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first+last)/2;
        }
        if (first>last){
            System.out.println("Element not found");
        }
    }

//    int BinarySearch(int arr[],int first,int last, int key){
//        if(first<=last && first<arr.length-1){
//            int mid=first+(last-first)/2;
//            if(arr[mid]==key){
//                return mid;
//            }
//            if(arr[mid]>key){
//                return BinarySearch(arr,first,mid-1,key);
//            }
//            else{
//                return BinarySearch(arr,mid+1,last,key);
//            }
//        }
//        return -1;
//    }

}
