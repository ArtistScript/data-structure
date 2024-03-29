package com.lc;

/**
 * ClassName: Solution63 <br/>
 * Function:  <br/>
 * Date: 2019-08-22 15:57<br/>
 *
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        if(m==0) return 0;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];//dp的值是解法的种数，不是步数
        for(int i=0;i<m;i++) {
            if(obstacleGrid[i][0]==1) dp[i][0]=0;
            else dp[i][0]=i>0?dp[i-1][0]:1;
        }
        for(int j=0;j<n;j++){
            if(obstacleGrid[0][j]==1) dp[0][j]=0;
            else dp[0][j]=j>0?dp[0][j-1]:1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1) dp[i][j]=0;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
