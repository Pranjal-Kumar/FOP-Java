package helloworld;

public class SearchingSorting {
    public static void main(String[] args) {
        int x=3;
        int n=4;
//        int ans = power(x,n);
//        System.out.println(ans);
        int ans1=power1(x,n);
        System.out.println(ans1);



    }
//    O(n)
//    public static int power(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        int powerMinus1=power(x,n-1);
//        return x*powerMinus1;
//    }

//    O(log n)
    static int power1(int x,int n){
        if(n==0){
            return  1;
        }

        int ans = 0;
        if(n%2==0){
            ans = power1(x,n/2);
            ans=ans*ans;
        }
        else{
            ans = power1(x,n/2);
            ans=ans*ans*x;
        }
        return ans;
    }




}
