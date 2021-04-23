package helloworld;

public class FindFloor {
    public static void main(String[] args) {
        int []arr={1,4,5,8,10,15};
        int key=6;
        int ans=floor(arr,key);
        System.out.println(ans);
    }
    static int floor(int arr[],int key){
        int floor = -1;
        for(int i=0;i< arr.length;i++){
            if(key>=arr[i]){
                floor=arr[i];
            }
            else{
                break;
            }
        }
        return floor;
    }
}
