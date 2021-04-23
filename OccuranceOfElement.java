package helloworld;

import java.util.HashMap;

public class OccuranceOfElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]) == false){
                hm.put(arr[i],hm.get(arr[i]+1));
            }
            else{
                System.out.println(arr[i]);
            }
        }


    }
}
