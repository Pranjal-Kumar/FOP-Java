package helloworld;
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//-------------Q1---------------------------------
//       System.out.println("Enter number:");
//       int n= input.nextInt();
//       oddEven(n);



//--------------Q2------------------------------
//        System.out.println("Enter length of triangle:");
//        int N = input.nextInt();
//        int sum=0;
//        int count=1;
//        triangle(N,sum,count);

//------------Q3---------------------
//        System.out.println("Enter length of array:");
//        int n = input.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter values in array:");
//        for(int i=0;i<n;i++){
//            arr[i]= input.nextInt();
//        }
//
//        System.out.println(isSorted(arr,0,0));

// -------------Q4--------------------------------
//        System.out.println("Enter length of array:");
//        int n = input.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter values in array:");
//        for(int i=0;i<n;i++){
//            arr[i]= input.nextInt();
//        }
//        System.out.println("Enter value to be searched:");
//        int M = input.nextInt();
//        find(arr,M,0);

//---------------Q5------------------------------
//        System.out.println("Enter the size of array:");
//        int N = input.nextInt();
//        int []arr = new int[N];
//        System.out.println("Enter values in array:");
//        for (int i=0;i<N;i++){
//            arr[i]=input.nextInt();
//        }
//        System.out.println("Enter value whose index to be searched:");
//        int M = input.nextInt();
//        SearchIndex(arr,M,0);


//--------------Q6---------------------------
//        System.out.println("Enter the size of array:");
//        int N = input.nextInt();
//        int []array = new int[N];
//        System.out.println("Enter values in array:");
//        for (int i=0;i<N;i++){
//            array[i]=input.nextInt();
//        }
//        System.out.println("Enter value whose index to be searched:");
//        int M = input.nextInt();
//        Searchindex(array,M,N-1);


//------------------Q7--------------------------
//        System.out.println("Enter the size of array:");
//        int n = input.nextInt();
//        int arr[]=new int[n];
//        System.out.println("Enter values in array:");
//        for(int i=0;i<n;i++){
//            arr[i]=input.nextInt();
//        }
//        System.out.println("Enter the key which index to be found:");
//        int key = input.nextInt();
//
//        int count=0;
//        int ans[]=Search(arr,0,key,count);
//
//        for(int i=0;i< ans.length;i++){
//            System.out.println(ans[i]);
//        }

//-------------Q8--------------------
        System.out.println("Enter length of array:");



    }
//--------Q1----------------
//    public static void oddEven(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        if(n%2!=0){
//            System.out.println(n);
//        }
//        oddEven(n-1);
//        if(n%2==0){
//            System.out.println(n);
//        }
//
//
//    }



//--------------Q2----------------------
//    public static void triangle(int N,int sum,int count){
//      if(count>N){
//          return;
//      }
//      else {
//          sum = sum + count;
//          System.out.println(sum);
//          count++;
//          triangle(N, sum, count);
//      }
//    }


//-------------------Q3----------------
//    public static boolean isSorted(int arr[],int index,int count){
//        if (arr[index] <= arr[index+1]) {
//            count++;
//
//        }
//        if(index < arr.length){
//            index=index+1;
//        }
//
//        isSorted(arr,index,count);
//        if(count == arr.length-1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

//-----------------Q4---------------------
//    public static void find(int arr[],int input,int index){
//
//        if(index>= arr.length){
//            System.out.println("Not Found");
//            return;
//        }
//        if(arr[index] == input){
//            System.out.println("Found");
//            return;
//        }
//        index=index+1;
//        find(arr,input,index);
//
//    }

//------------------Q5---------------------
//    public static void SearchIndex(int arr[],int M,int index){
//
//        if(index>= arr.length){
//            System.out.println("-1");
//            return;
//        }
//        if(arr[index] == M){
//            System.out.println(index);
//            return;
//        }
//
//        index=index+1;
//        SearchIndex(arr,M,index);
//    }

//----------Q6------------------------------
//    public static void Searchindex(int arr[],int M,int index){
//        if(index<=-1){
//            System.out.println("-1");
//            return;
//        }
//        if(arr[index] == M){
//            System.out.println(index);
//            return;
//        }
//        index=index-1;
//        Searchindex(arr,M,index);
//
//    }


//------------Q7---------------------
//    public static int[] Search(int[] arr,int idx,int key,int count){
//        // base
//        if(idx== arr.length){
//            int[] ans = new int[count];
//            return ans;
//        }
//
//        //check if arr[idx] == key => count++
//        if (arr[idx]==key) {
//            count++;
//        }
//
//        //call
//        int[] nowAns = Search(arr,idx+1,key,count);
//
//        //check if arr[idx] == key => ans[count-1]=idx
//        if(arr[idx]==key){
//            nowAns[count-1]=idx;
//        }
//        return nowAns;
//    }

//-------------Q8-----------------------
        public static boolean palindrome(int arr[],int first_index,int last_index,int count){
        if(arr[first_index]==arr[last_index]){
            count++;
        }
        palindrome(arr,first_index+1,last_index-1,count);
        if(count>=(arr.length/2)){
            return true;
        }
        else return false;


    }

}




