package com.lc;

/**
 * ClassName: Solution62 <br/>
 * Function:  <br/>
 * Date: 2019-08-22 10:43<br/>
 *
 */
public class Solution62 {
    /**
     * 解法：动态规划
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[] dp=new int[n];//dp的值是解法的种数，不是步数
        for(int i=0;i<n;i++) dp[i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }
}
