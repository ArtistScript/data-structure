package com.lc;

/**
 * ClassName: Solution64 <br/>
 * Function:  <br/>
 * Date: 2019-08-22 16:10<br/>
 *
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        if(m==0) return 0;
        int n=grid[0].length;
        int[][] dp=new int[m][n];//dp为到达i，j所需要的最短距离
        for(int i=0;i<m;i++){
            dp[i][0]=i>0?dp[i-1][0]+grid[i][0]:grid[i][0];
        }
        for(int j=0;j<n;j++){
            dp[0][j]=j>0?dp[j-1][0]+grid[j][0]:grid[j][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
