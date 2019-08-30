package com.lc;

/**
 * ClassName: Solution35 <br/>
 * Function:  <br/>
 * Date: 2019-08-09 15:26<br/>
 *
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=(l-r)/2+r;
            if(nums[mid]>target) r=mid-1;
            else if(nums[mid]<target) l=mid+1;
            else return mid;
        }
        return l;
    }
}
