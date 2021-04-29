package helloworld;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aced";
        int ans = lcs(str1,str2,str1.length(),str2.length());
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        int ans1 = lcsMemoization(str1,str2,str1.length(),str2.length(),dp);
//        int ans2 = ilcTabulation(str1,str2);
        System.out.println("Length of Longest Common Subsequence: " + ans);
        System.out.println("Length of Longest Common Subsequence using Memoization: " + ans1);
//        System.out.println("Length of Longest Common Subsequence using Tabulation: " + ans2);
    }

    private static int lcs(String str1, String str2, int m, int n) {
        if(m==0 || n==0){
            return 0;
        }

        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return lcs(str1,str2,m-1,n-1) + 1;
        }
        else{
            int opt1 = lcs(str1,str2,m,n-1);
            int opt2 = lcs(str1,str2,m-1,n);
            return Math.max(opt1,opt2);

        }
    }

    private static int lcsMemoization(String str1, String str2, int m, int n, int dp[][]) {
        if(m==0 || n==0){
            return 0;
        }

        if(dp[m][n] != 0){
            return dp[m][n];
        }

        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return dp[m][n] =  lcsMemoization(str1,str2,m-1,n-1,dp) + 1;
        }
        else{
            int opt1 = lcsMemoization(str1,str2,m,n-1,dp);
            int opt2 = lcsMemoization(str1,str2,m-1,n,dp);
            return dp[m][n] = Math.max(opt1,opt2);

        }
    }

//    private static int ilcTabulation(String str1, String str2){
//       int m = str1.length();
//       int n = str2.length();
//
//       int dp[][] = new int[m+1][n+1];
//
//       for(int i=1;i<=m;i++){
//           for(int j=1;i<=n;j++){
//               if(str1.charAt(i-1) == str2.charAt(j-1)){
//                   dp[i][j] = dp[i-1][j-1] + 1;
//               }
//               else{
//                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//
//               }
//           }
//       }
//       return dp[m][n];
//
//    }
}
