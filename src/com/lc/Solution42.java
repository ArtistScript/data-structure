package com.lc;

import java.util.HashSet;
import java.util.Stack;

/**
 * ClassName: Solution42 <br/>
 * Function:  <br/>
 * Date: 2019-08-13 17:02<br/>
 *
 */
public class Solution42 {
    /**
     * 1. 类似之前有道最大蓄水量的题，使用双指针，比较trick
     * 2. 使用tack递减堆，再用宽乘高计算面积
     * @param height
     * @return
     */
    public int trap(int[] height) {
        //严格递减堆栈，放入数组的下标
        Stack<Integer> decrease = new Stack<>();
        int sum=0;
        for(int i=0;i<height.length;i++){
            //注意这里是大于等于，因为两边柱子高度相等，中间有凹形，也可以围成
            while (decrease.size() >0 && height[i] >= height[decrease.peek()]) {//因为是严格递减，堆大于1，一定能为成凹形
                int bot = decrease.pop();
                sum += decrease.isEmpty()?0:(Math.min(height[decrease.peek()],height[i])-height[bot])*(i-decrease.peek()-1);
            }
            if(decrease.size() ==0 || height[i] <= height[decrease.peek()]) decrease.push(i);
        }
        return sum;
    }
}
