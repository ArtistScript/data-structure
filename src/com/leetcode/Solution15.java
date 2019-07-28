package com.leetcode;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.ws.util.ReadAllStream;

import java.util.*;

/**
 * ClassName: Solution15 <br/>
 * Function:  <br/>
 * Date: 2019-07-23 22:39<br/>
 *
 */
public class Solution15 {

        /**
         * 转化为two-sum问题
         * @param nums
         * @return
         */
        public List<List<Integer>> threeSum(int[] nums) {
                Arrays.sort(nums);
                List<List<Integer>> result= new ArrayList<>();
                if(nums==null||nums.length<3) return result;
                for(int splitIndex=0;splitIndex<nums.length;splitIndex++){
                        if(splitIndex!=0&&nums[splitIndex]==nums[splitIndex-1]) continue;
                        else{
                                List<List<Integer>> twoResult=twooSum(nums,splitIndex,0-nums[splitIndex]);
                                for(List<Integer> list:twoResult){
                                        list.add(nums[splitIndex]);
                                        result.add(list);
                                }
                        }
                }
                return result;
        }

        private List<List<Integer>> twooSum(int[] nums,int splitIndex,int target){
                List<List<Integer>> result=new ArrayList<>();
                int i=splitIndex+1,j=nums.length-1;
                while (i<j){
                        if(i!=splitIndex+1&&nums[i]==nums[i-1]) i++;
//                        else if((j>0&&nums[j]==nums[j-1])&i<j-1) j--;
                        else{
                                int sum=nums[i]+nums[j];
                                if(sum<target) i++;
                                else if(sum>target) j--;
                                else{
                                        List<Integer> tmpresult=new ArrayList<>();
                                        tmpresult.add(nums[i]);
                                        tmpresult.add(nums[j]);
                                        result.add(tmpresult);
                                        i++;
                                        j--;
                                }
                        }
                }
                return result;
        }
}
