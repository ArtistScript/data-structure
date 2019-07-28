package com.leetcode;

import java.util.Arrays;

/**
 * ClassName: Solution16 <br/>
 * Function:  <br/>
 * Date: 2019-07-24 21:47<br/>
 *
 */
public class Solution16 {
        public int threeSumClosest(int[] nums, int target) {
                Arrays.sort(nums);
                int closeError=Integer.MAX_VALUE;
                for(int split=0;split<nums.length;split++){
                        if(split!=0&&nums[split]==nums[split-1]) continue;
                        else{
                                int error=twoSumCloset(nums,split,target-nums[split]);
                                int sum=target+error;
                                if(Math.abs(target-sum)<Math.abs(closeError)){
                                        closeError=sum-target;
                                }
                        }
                }
                return target+closeError;
        }

        private int twoSumCloset(int[] nums,int splitIndex,int target){
                int closeTarget=Integer.MAX_VALUE;//和target的距离
                int i=splitIndex+1,j=nums.length-1;
                while (i<j){
                        if(i!=splitIndex+1&&nums[i]==nums[i-1]) i++;
                        else{
                                int sum=nums[i]+nums[j];
                                if(sum<target){
                                        if(Math.abs(sum-target)<Math.abs(closeTarget)) closeTarget=sum-target;
                                        i++;
                                }else if(sum>target){
                                        if(Math.abs(sum-target)<Math.abs(closeTarget)) closeTarget=sum-target;
                                        j--;
                                }else return 0;
                        }
                }
                return closeTarget;
        }
}
