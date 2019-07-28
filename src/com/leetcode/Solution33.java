package com.leetcode;

/**
 * ClassName: Solution33 <br/>
 * Function: leetcode No.33 <br/>
 * Date: 2019-07-03 22:22<br/>
 *
 * @version 1.0
 */

/**
 * 可以画出两条斜线，便于查看往哪边查找
 */
public class Solution33 {
        public int search(int[] nums, int target) {
                int left=0;
                int right=nums.length-1;
                while (left<=right){
                        int mid=(left)+(right-left)/2;
                        if(nums[mid]>=nums[left]&&nums[mid]<=nums[right]){//单调
                                if(nums[mid]>target) right=mid-1;
                                else if(nums[mid]<target) left=mid+1;
                                else return mid;
                        }else{//不单调
                                if(nums[mid]>nums[right]){//右不单调
                                        if(nums[mid]>target){
                                                if(nums[left]>target) left=mid+1;//右边找
                                                else right=mid-1;
                                        }else if(nums[mid]<target){//右边找
                                                left=mid+1;
                                        }else return mid;
                                }else {//左不单调
                                        if(nums[mid]>target){
                                                right=mid-1;
                                        }else if(nums[mid]<target){
                                                if(nums[right]<target) right=mid-1;
                                                else left=mid+1;
                                        }
                                        else return mid;
                                }
                        }

                }
                return -1;
        }
}
