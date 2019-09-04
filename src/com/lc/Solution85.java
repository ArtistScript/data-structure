package com.lc;

import java.util.Stack;

/**
 * ClassName: Solution85 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 15:59<br/>
 *
 */
public class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int[] heigths=new int[matrix[0].length];
        int maxRac=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0') heigths[j]=0;
                else heigths[j]+=1;
            }
            maxRac=Math.max(maxRac,maxRectangleArea(heigths));
        }
        return maxRac;
    }

    private int maxRectangleArea(int[] heights){
        int maxRec=0;
        int areaRec=0;
        Stack<Integer> taller=new Stack<>();
        for(int i=0;i<=heights.length;i++){
            int h=(i==heights.length)?0:heights[i];
            if(taller.size()==0||heights[taller.peek()]<=h){
                taller.add(i);
            }else{
                int top=taller.pop();
                areaRec=heights[top]*(taller.empty()?i-(-1)+1-2:i-taller.peek()+1-2);
                maxRec=Math.max(maxRec,areaRec);
                i--;
            }
        }
        return maxRec;
    }
}
