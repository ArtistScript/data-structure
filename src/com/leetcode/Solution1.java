package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution1 <br/>
 * Function: leetcode No.1 <br/>
 * Date: 2019-07-16 21:52<br/>
 *
 * @version 1.0
 */
public class Solution1 {
        public int[] twoSum(int[] nums, int target) {
                int[] res=new int[2];
                Map<Integer,Integer> index=new HashMap<>();
                for(int i=0;i<nums.length;i++){
                        index.put(nums[i],i);
                }
                for(int i=0;i<nums.length;i++){
                        if(index.containsKey(target-nums[i])&&index.get(target-nums[i])!=i){
                                res[0]=i;
                                res[1]=index.get(target-nums[i]);
                                break;
                        }

                }
                return res;

        }
}
