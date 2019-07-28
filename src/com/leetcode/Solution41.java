package com.leetcode;

/**
 * ClassName: Solution41 <br/>
 * Function: leetcode No.41 <br/>
 * Date: 2019-07-12 00:15<br/>
 *
 * @version 1.0
 */
public class Solution41 {
        /**
         * 首先把小于的数，进行转化，变成不会影响后面计算的其他数，比如nums.length+5
         * 然后通过数组的下标去标记
         * @param nums
         * @return
         */
        public int firstMissingPositive(int[] nums) {
                if(nums==null||nums.length==0) return 1;//边界条件不要忘记判断
                //把小于等于0的数和大于nums.length的数，改成不会应该影响结果的其他数
                for(int i=0;i<nums.length;i++){
                        if(nums[i]<=0) nums[i]=nums.length+5;
                }
                for(int i=0;i<nums.length;i++){
                        if(nums[i]==Integer.MIN_VALUE) continue;
                        int index=Math.abs(nums[i]);//还原为转化前的数
                        if(index<=nums.length&&index>0&&nums[index-1]>0) nums[index-1]=-nums[index-1];
                }
                for(int i=0;i<nums.length;i++){
                        if(nums[i]>=0) return i+1;
                }
                return nums.length+1;
        }
}
