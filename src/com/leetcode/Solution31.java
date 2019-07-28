package com.leetcode;

import java.util.Arrays;

/**
 * ClassName: Solution31 <br/>
 * Function: leetcode No.31 <br/>
 * Date: 2019-07-10 17:44<br/>
 *
 * @version 1.0
 */
public class Solution31 {

        /**
         * 从后往前，找到第一个下降沿a，就是和后面交换的未知。从后往前，找到第一个比a大的数字，就和前面交换的b
         * @param nums
         */
        public void nextPermutation(int[] nums) {
                //寻找下降沿
                int arraryLength=nums.length;
                int before=nums[arraryLength-1];
                int down=-1;
                int up=-1;
                for(int index=arraryLength-1;index>=0;index--){
                        if(nums[index]<before) {
                                down=index;
                                break;
                        }
                        before=nums[index];
                }
                if(down==-1){
                        Arrays.sort(nums);
                        return;
                }
                //寻找up
                for(int index=arraryLength-1;index>=0;index--){
                        if(nums[index]>nums[down]){
                                up=index;
                                break;
                        }
                }
                swap(nums,down,up);
                if(down==arraryLength-1) return;
                Arrays.sort(nums,down+1,arraryLength);
        }
        private void swap(int[] nums,int a,int b){
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
        }
}
