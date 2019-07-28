package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution18 <br/>
 * Function:  <br/>
 * Date: 2019-07-24 22:17<br/>
 *
 */
public class Solution18 {
        public List<List<Integer>> fourSum(int[] nums, int target) {
                Arrays.sort(nums);
                List<List<Integer>> result =new ArrayList<>();
                for(int fourStart=0;fourStart<nums.length;fourStart++){
                        if(fourStart!=0&&nums[fourStart]==nums[fourStart-1]) continue;
                        else {
                                List<List<Integer>> threeResult=threeSum(nums,fourStart,target-nums[fourStart]);
                                for(List<Integer> tmp:threeResult){
                                        tmp.add(nums[fourStart]);
                                        result.add(tmp);
                                }
                        }
                }
                return result;
        }

        public List<List<Integer>> threeSum(int[] nums,int start,int target){
                List<List<Integer>> result =new ArrayList<>();
                for(int threeStart=start+1;threeStart<nums.length;threeStart++){
                        if(threeStart!=start+1&&nums[threeStart]==nums[threeStart-1]) continue;
                        else{
                                List<List<Integer>> twoResult=twoSum(nums,threeStart,target-nums[threeStart]);
                                for(List<Integer> tmp:twoResult){
                                        tmp.add(nums[threeStart]);
                                        result.add(tmp);
                                }
                        }
                }
                return result;
        }
        public List<List<Integer>> twoSum(int[] nums,int start,int target){
                List<List<Integer>> result=new ArrayList<>();
                int i=start+1,j=nums.length-1;
                while (i<j){
                        if(i!=start+1&&nums[i]==nums[i-1]) i++;
                        else{
                                int sum=nums[i]+nums[j];
                                if(sum<target) i++;
                                else if(sum>target) j--;
                                else{
                                        List<Integer> temList=new ArrayList<>();
                                        temList.add(nums[i]);
                                        temList.add(nums[j]);
                                        result.add(temList);
                                        i++;
                                        j--;
                                }
                        }
                }
                return result;
        }
}
