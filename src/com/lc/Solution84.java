package com.lc;

import java.util.Stack;

/**
 * ClassName: Solution84 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 11:39<br/>
 *
 */
public class Solution84 {
    /**
     * 需要一个或者多个柱子组成矩形，中间的柱子最低，最右边柱子比最右边+1柱子高，最左边柱子比最左边-1柱子高
     * x作为最低的柱子，需要找到两边比他高的柱子所能到达的最远距离。（当遇到更小的柱子的时候，就是达到最远距离，所以用最大堆）
     * 和雨水蓄水量的题目差不多
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);//i=len，为右边界
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }else{
                //i比右边界第一个小的数,s.peek为左边界第一个小的数，矩形长度为i-s.peek+1-2
                //i=i-(-1)+1-2  -1为不存在的左边界
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;//抵消i的自动+1
            }
        }
        return maxArea;
    }
}
