package helloworld;

import java.util.Scanner;

public class CoinExchangeProblem {

    public static int minCoinsNeeded(int amount, int[] denominations){

        if(amount == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0;i<denominations.length;i++){
            if(amount-denominations[i]>=0) {
                int smallAns = minCoinsNeeded(amount - denominations[i], denominations);
                ans = Math.min(ans, smallAns + 1);
            }

        }
        return ans;
    }

    public static int minCoinsNeededUsingMemoization(int amount, int[] denominations, int[] dpMemory){

        if(amount == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        if(dpMemory[amount]!=0){
            return dpMemory[amount];
        }

        for(int i=0;i<denominations.length;i++){
            if(amount-denominations[i]>=0) {
                int smallAns = minCoinsNeeded(amount - denominations[i], denominations);
                ans = Math.min(ans, smallAns + 1);
                dpMemory[amount] = ans;
            }

        }
        return ans;
    }

    public static int minCoinsNeededUsingTabulation2dArray(int amount, int[] denominations){
        int n = denominations.length;
        int dp[][] = new int[n+1][amount+1];

        for(int i=0;i<n;i++){
            dp[i][0] = 0;
        }

        for(int i=0;i<=amount;i++) {
            dp[0][i] = i;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j-denominations[i-1]>=0){
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-denominations[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][amount];
    }

    public static int minCoinsNeededUsingTabulation1dArray(int amount, int[] denominations){
        int n = denominations.length;
        int dp[] = new int[amount+1];

        for(int i=0;i<=amount;i++) {
            dp[i] = i;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j-denominations[i-1]>=0){
                    dp[j] = Math.min(dp[j],1+dp[j-denominations[i-1]]);
                }
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = s.nextInt();
        System.out.println("Enter size of coin array:");
        int n = s.nextInt();
        System.out.println("Enter value of coins:");
        int denominations[] = new int[n];
        for(int i=0;i<denominations.length;i++){
            denominations[i] = s.nextInt();
        }
        int dpMemory[] = new int[amount+1];
        System.out.println("Minimum Coins Needed : " + minCoinsNeeded(amount,denominations));
        System.out.println("Minimum Coins Needed using Memoization: " + minCoinsNeededUsingMemoization(amount,denominations,dpMemory));
        System.out.println("Minimum Coins Needed using Tabulation 2d Array : " + (minCoinsNeededUsingTabulation2dArray(amount,denominations)));
        System.out.println("Minimum Coins Needed using Tabulation 1d Array : " + (minCoinsNeededUsingTabulation1dArray(amount,denominations)));


    }

}
