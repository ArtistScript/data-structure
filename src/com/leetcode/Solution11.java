package com.leetcode;

/**
 * ClassName: Solution11 <br/>
 * Function:  <br/>
 * Date: 2019-07-20 14:13<br/>
 *
 */

import java.util.Stack;
import java.util.Vector;

/**
 * 如果后面的数字比现在大，一直往后就好
 * 如果开始下降
 */
public class Solution11 {
        public int maxArea(int[] height) {
                int i=0,j=height.length-1;
                int maxarare=-1;
                while (i<j){
                        maxarare=Math.max((j-i)*Math.min(height[i],height[j]),maxarare);
                        if(height[i]<height[j]) i++;
                        else j--;
                }
                return maxarare;
        }
}
