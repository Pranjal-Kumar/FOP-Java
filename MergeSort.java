package helloworld;
import java.util.*;
public class MergeSort {
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

//        int arr[]={12,41,5,18,22,1,77,3};
//        int leftEnd=0;
//        int rightEnd= arr.length-1;
//        mergeSort(arr,leftEnd,rightEnd);
//        printArray(arr);

//        int arr[]={2,1,4,3};
//        int start=0;
//        int end=arr.length-1;
//        int mid=start+(end-start)/2;
//        merge(arr,start,mid,end);
//        for( int x : arr){
//            System.out.println(x);
//        }

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=size2-1;i>=0;i--){
            System.out.println(arr2[i]);
        }
        for(int i=size1-1;i>=0;i--){
            System.out.println(arr1[i]);
        }


    }




    public static void mergeSort(int arr[],int leftEnd,int rightEnd){
//        divide
        if(leftEnd<rightEnd) {
            int mid = leftEnd + (rightEnd - leftEnd) / 2;
            mergeSort(arr, leftEnd, mid);
            mergeSort(arr, mid + 1, rightEnd);
//            merge
            merge(arr,leftEnd,mid,rightEnd);

        }
    }

    public static void merge(int arr[],int left,int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge2SortedArray(int arr1[], int arr2[], int arr3[]){
        for(int i=0,j=0,k=0;i<arr1.length+ arr2.length-2;){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
    }

    int[] merge1(int[] numb, int start, int mid, int end) {
        int left = start; //inital index of first subarray
        int right = mid + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] temp = new int[numb.length];

        while (left <= mid && right <= end) {
            if (numb[left] >= numb[right]) {
                temp[k] = numb[left];
                k++;
                left++;
            } else {
                temp[k] = numb[right];
                k++;
                right++;
            }
        }

        // Copy the remaining elements on left half , if there are any
        while (left <= mid) {
            temp[k] = numb[left];
            k++;
            left++;
        }

        // Copy the remaining elements on right half , if there are any
        while (right <= end) {
            temp[k] = numb[right];
            k++;
            right++;
        }

        // Copy the remaining elements from array t back the numbers array
        left = start;
        k = 0;
        while (left <= end) {
            numb[left] = temp[k];
            left++;
            k++;
        }

        return numb;
    }

}
