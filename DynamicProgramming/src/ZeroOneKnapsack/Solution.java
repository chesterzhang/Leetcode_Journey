package ZeroOneKnapsack;

//0-1 背包问题, 并不是leetcode 中的题目, 但0-1背包在leetcode 中有许多变种题目
class Solution {

    // v[] 物品价值, w[] 物品重量, C 背包容积
    public int maxVal(int[] v, int[] w, int C)
    {
        int[][] dp=new int[v.length][C+1];//dp[idx][c]

        for (int  j= 0; j < C+1; j++) {
            if (w[0]<=j){
                dp[0][j]=v[0];
            }else {
                dp[0][j]=0;
            }
        }

        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < C+1; j++) {
                dp[i][j]=dp[i-1][j];
                if (j>=w[i]){
                    dp[i][j]=Math.max(dp[i][j],v[i]+dp[i-1][j-w[i]]);
                }
            }
        }

        return dp[v.length-1][C];
    }
}
