package helloworld;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "sagar";
        String str2 = "agars";
        System.out.println(checkAnagram(str1,str2));
    }

    private static boolean checkAnagram(String str1, String str2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(map.containsKey(ch)){
                int currOcc = map.get(ch);
                map.put(ch,currOcc+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(map.containsKey(ch)){
                int currOcc = map.get(ch);
                map.put(ch,currOcc-1);

                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
            else{
                return false;
            }
        }

        if(map.isEmpty() == true){
            return true;
        }
        else{
            return false;
        }
    }
}
