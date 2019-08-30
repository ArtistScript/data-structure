package com.lc;

import java.util.Arrays;

/**
 * ClassName: Solution45 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 14:18<br/>
 *
 */
public class Solution45 {
    public int jump(int[] nums) {
        int fatherJump=0;
        int jumps=0;
        int curEnd=0;
        for(int i=0;i<nums.length;i++){
            fatherJump=Math.max(fatherJump,i+nums[i]);
            if(curEnd>=nums.length-1) return jumps;
            if(curEnd==i){
                curEnd=fatherJump;
                jumps++;
            }
        }
        return jumps;
    }

}
