package com.leetcode;

/**
 * ClassName: Solution283 <br/>
 * Function: Leetcode No.283 <br/>
 * Date: 2019-07-14 20:51<br/>
 *
 * @version 1.0
 */
public class Solution283 {
        public void moveZeroes(int[] nums) {
                int i=0,k=0;//i为非0下标，j为移动指针
                for(k=0;k<nums.length;k++){
                        if(nums[k]!=0) nums[i]=nums[k];
                        if(nums[k]!=0) {
                                i++;
                        }
                }
                while (i<nums.length){
                        nums[i++]=0;
                }
        }
}
