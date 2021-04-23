package helloworld;

import java.util.HashSet;

public class PairSumToTarget {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 17;
        checkPairForSum(arr,target);
    }

    private static void checkPairForSum(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int remaining = target - arr[i];
            if(hs.contains(remaining)){
                System.out.println("We got it: "  + arr[i] + " " + remaining);
                return;
            }
            else{
                hs.add(arr[i]);
            }
        }
        System.out.println("Do not contain");
    }
}
