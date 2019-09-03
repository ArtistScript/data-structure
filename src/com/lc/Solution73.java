package com.lc;

/**
 * ClassName: Solution73 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 15:25<br/>
 *
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        boolean fr=false;
        boolean fc=false;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    if(i==0) fr=true;
                    if(j==0) fc=true;
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[0][j]==0||matrix[i][0]==0) matrix[i][j]=0;
            }
        }
        if(fr){
            for(int i=0;i<col;i++) matrix[0][i]=0;
        }
        if(fc){
            for(int i=0;i<row;i++) matrix[i][0]=0;
        }
    }
}
