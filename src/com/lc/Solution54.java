package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution54 <br/>
 * Function:  <br/>
 * Date: 2019-08-19 15:46<br/>
 *
 */
public class Solution54 {
    //定义右下左上四个方向
    int dx[] =new int[]{0,1,0,-1};
    int dy[] =new int[]{1,0,-1,0};

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int row=matrix.length;
        if(row==0) return res;
        int col=matrix[0].length;
        boolean[][] vis=new boolean[row][col];
        vis[0][0]=true;
        res.add(matrix[0][0]);
        dfs(0,0,0,vis,matrix,res);
        return res;
    }

    private void dfs(int i,int j,int direction,boolean[][] vis, int[][] matrix,List<Integer> res){
        for(int d=0;d<4;d++){
            int ti=i+dx[(d+direction)%4];
            int tj=j+dy[(d+direction)%4];
            if(checkValid(ti,tj,matrix.length,matrix[0].length,vis)){
                vis[ti][tj]=true;
                res.add(matrix[ti][tj]);
                dfs(ti,tj,(d+direction)%4,vis,matrix,res);
                break;
            }
        }

    }

    private boolean checkValid(int i,int j, int row ,int col,boolean[][] vis){
        if(i>=0&&i<row&&j>=0&&j<col&&vis[i][j]==false) return true;
        else return false;
    }
}
