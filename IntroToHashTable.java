package helloworld;

import java.util.HashMap;

public class IntroToHashTable {
    public static void main(String[] args) {
//        Hashtable<String,Integer> phoneBook = new Hashtable<>();
//        phoneBook.put("Sagar", 1);
//        phoneBook.put("Pranjal", 2);
//        phoneBook.put("Krishna", 3);
//        System.out.println(phoneBook.keySet());
//        System.out.println(phoneBook.values());

        HashMap<Integer,Integer> pairs = new HashMap<>();
        pairs.put(0,1);
        pairs.put(0,2);
        pairs.put(2,3);
        pairs.put(1,0);
        pairs.put(2,0);
        if(pairs.containsKey(0)){
            pairs.containsKey(pairs.containsValue(2));
        }

        int arr[][] = {
                {0,1},
                {2,3},
                {1,0},
                {3,3},
        };

        boolean isSymmetric = false;
        for(int i=0;i<arr.length;i++){
            int key = arr[i][0];
            int val = arr[i][1];
            Integer value = pairs.get(val);
            if(value!= null && value == key){
                System.out.println("Matrix contains symmetric pair: {"+key+","+val+"}");
                isSymmetric = true;
                break;
            }
            else{
                pairs.put(key,val);
            }
        }
        if(isSymmetric == false){
            System.out.println("Matrix does not contains symmetric pair.");
        }



    }
}
