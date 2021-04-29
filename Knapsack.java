package helloworld;

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int weights[] = {2,1,3,2};
        int values[] = {12,10,21,15};
        int maxWeight = 8;
        int ans = knapsack(n,weights,values,maxWeight);
        System.out.println(ans);
    }

    private static int knapsack(int n, int[] weights, int[] values, int maxWeight) {
        if(n == 0 || maxWeight == 0){
            return 0;
        }
        if(weights[n-1] > maxWeight){
            int ans = knapsack(n-1,weights,values,maxWeight);
            return ans;
        }
        else{
            int includeItem = knapsack(n-1,weights,values,maxWeight-weights[n-1]) + values[n-1];
            int excludeItem = knapsack(n-1,weights,values,maxWeight);
            int ans = Math.max(includeItem,excludeItem);
            return ans;
        }
    }
}
