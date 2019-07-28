package com.leetcode;

/**
 * solution2 link for loop
 * https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/2481/Share-my-O(log(min(mn))-solution-with-explanation
 */
public class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /**
         * 对于奇偶数的处理，对于边界条件的检查
         *
         * 方法：i为数组的第i个，j为数组的第j个（不是下标），i+j=（（len（nums）+len（nums））+1）/2  1是为了适配n+m为奇数的情况
         *
          */
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int imin=0;//从第0个开始遍历，适配数组为空的情况
        int imax=nums1.length;
        int half=(nums1.length+nums2.length+1)/2;
        while (imin<=imax){
            int i=(imin+imax)/2;
            int j=half-i;
            if(i<imax && nums1[i]<nums2[j-1]) imin=i+1;
            else if(i>imin && nums2[j]<nums1[i-1]) imax=i-1;
            else{
                // i is in position
                int maxleft=0;
                int maxright=0;
                if (i<=0) maxleft=nums2[j-1];
                else if (j<=0) maxleft=nums1[i-1];
                else maxleft=Math.max(nums1[i-1],nums2[j-1]);
                if ((nums1.length+nums2.length)%2==1) return maxleft;
                if(i>=nums1.length) maxright=nums2[j];
                else if(j>=nums2.length) maxright=nums1[i];
                else maxright=Math.min(nums1[i],nums2[j]);
                return (maxleft+maxright)/2.0;
            }
        }
        return 0.0;
    }
}
