package com.lc;

/**
 * ClassName: Solution34 <br/>
 * Function:  <br/>
 * Date: 2019-08-08 15:58<br/>
 *
 */

/**
 * 解法：二分查找
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        int left=0;
        int rihgt=nums.length-1;
        int l=-1;
        int r=-1;//l第一个小于target，r第一个大于target
        result[0]=l;
        result[1]=r;
        if(nums.length==0) return result;
        //找第一个小于
        while(left<=rihgt){
            int mid = (left-rihgt)/2+rihgt;
            if(nums[mid]>=target)rihgt=mid-1;
            else left=mid+1;
        }
        rihgt=rihgt<nums.length-1?rihgt+1:0;
        if(nums[rihgt]==target) l=rihgt;
        left=0;
        rihgt=nums.length-1;
        //找第一个大于
        while(left<=rihgt){
            int mid = (left-rihgt)/2+rihgt;
            if(nums[mid]<=target)left=mid+1;
            else rihgt=mid-1;
        }
        left= left>0?left-1:0;
        if(nums[left]==target) r=left;
        result[0]=l;
        result[1]=r;
        return result;
    }
}
