package helloworld;

import java.util.HashMap;

public class MatchingLockAndKeys {
    public static void main(String[] args) {
       int lock[] = {1,2,3,4,5};
       int key[] = {3,2,4,1};
       matchLockKeys(lock,key);
    }

    private static void matchLockKeys(int[] lock, int[] key) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<lock.length;i++){
            ans.put(lock[i],i);
        }

        for(int i=0;i<key.length;i++){
            if(ans.containsKey(key[i]) == false){
                System.out.println("Matching Not Found");
                return;
            }
        }
        System.out.println("Matching Found");
    }
}
