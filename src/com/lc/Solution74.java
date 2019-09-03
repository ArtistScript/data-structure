package com.lc;

/**
 * ClassName: Solution74 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 15:51<br/>
 *
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int i=matrix.length-1;
        int j=0;
        while (i>=0&&j<matrix[0].length){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) i--;
            else j++;
        }
        return false;
    }
}
