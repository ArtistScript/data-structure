package com.lc;

/**
 * ClassName: Solution48 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 15:43<br/>
 *
 */
public class Solution48 {
    /**
     * 顺时针旋转，找到它和上下，左右旋转的关系
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        upDown(matrix);
        symmetry(matrix);
    }

    private void upDown(int[][] matrix){
        for(int i=0;i<=matrix.length/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j]=temp;
            }
        }
    }
    private void symmetry(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
