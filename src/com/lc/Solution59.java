package com.lc;

/**
 * ClassName: Solution59 <br/>
 * Function:  <br/>
 * Date: 2019-08-21 14:31<br/>
 *
 */
public class Solution59 {
    //右，下，左，上的顺序
    int[] dx=new int[]{0,1,0,-1};
    int[] dy=new int[]{1,0,-1,0};

    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        boolean[][] vis=new boolean[n][n];
        vis[0][0]=true;
        res[0][0]=1;
        dfs(0,0,0,vis,res,2);
        return res;
    }
    private void dfs(int drc,int i,int j,boolean[][] vis,int[][] res,int value){
        for(int d=0;d<4;d++){
            int tx= i+dx[(drc+d)%4];
            int ty= j+dy[(drc+d)%4];
            if(checkValid(tx,ty,vis)){
                res[tx][ty]=value;
                vis[tx][ty]=true;
                dfs(drc+d,tx,ty,vis,res,value+1);
                break;
            }
        }
    }
    private boolean checkValid(int i ,int j,boolean[][] vis){
        if(i>=0&&i<vis.length&&j>=0&&j<vis[0].length&&!vis[i][j]) return true;
        else return false;
    }
}
