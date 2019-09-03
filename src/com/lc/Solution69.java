package com.lc;

/**
 * ClassName: Solution69 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 14:39<br/>
 *
 */
public class Solution69 {
    /**
     * 二分查找，找第一个平方小于等于x的数
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(mid*mid>x) right=mid-1;
            else left=mid+1;
        }
        return right;
    }
}
