package com.lc;

/**
 * ClassName: Solution55 <br/>
 * Function:  <br/>
 * Date: 2019-08-19 16:24<br/>
 *
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int curEnd=0;
        int maxEnd=0;
        int jumps=0;
        for(int i=0;i<nums.length&&i<=maxEnd;i++){
            maxEnd=Math.max(i+nums[i],maxEnd);
            if(curEnd==i){
                curEnd=maxEnd;
            }
        }
        return curEnd>=nums.length-1?true:false;
    }
}
