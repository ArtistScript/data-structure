package com.lc;

/**
 * ClassName: Solution88 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 19:42<br/>
 *
 */
public class Solution88 {
    /**
     * 因为nums1前面一件有数字了，所以从后面往前放数字，把大的数字先放下来
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int index=m+n-1;
        while (p1>=0&&p2>=0){
            //大的先放入
            if(nums1[p1]>nums2[p2]) nums1[index--]=nums1[p1--];
            else nums1[index--]=nums2[p2--];
        }
        while (p1>=0){
            nums1[index--]=nums1[p1--];
        }
        while (p2>=0){
            nums1[index--]=nums2[p2--];
        }
    }
}
