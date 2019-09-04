package com.lc;

/**
 * ClassName: Solution81 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 17:36<br/>
 *
 */
public class Solution81 {
    /**
     * 和33题的区别是，不能通过left,mid,right三个点判断是否单调，因为数组有重复的值
     * 但是过滤掉left和right相等的情况，就可以通过left,mid,right三个值进行判断
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            //最外面循环判断是否单调
            while (left<right&&nums[left]==nums[right]) left++;
            int mid=(right-left)/2+left;
            //单调
            if(nums[left]<=nums[mid]&&nums[mid]<=nums[right]){//单调
                if(nums[mid]<target) left=mid+1;
                else if(nums[mid]>target) right=mid-1;
                else return true;
            }else if(nums[right]<nums[mid]){//右边不单调
                if(nums[mid]>target){
                    if(nums[left]<=target)right=mid-1;
                    else left=mid+1;
                }else if(nums[mid]<target){
                    left=mid+1;
                }else return true;
            }else {//左边不单调
                if(nums[mid]<target){
                    if(target<=nums[right]) left=mid+1;
                    else right=mid-1;
                }else if(nums[mid]>target){
                    right=mid-1;
                }else return true;
            }
        }
        return false;
    }
}
