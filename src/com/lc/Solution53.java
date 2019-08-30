package com.lc;

/**
 * ClassName: Solution53 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 17:22<br/>
 *
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int maxtmp=0;
        for(int i:nums){
            maxtmp=(maxtmp<0?0:maxtmp);
            maxtmp=maxtmp+i;
            maxsum=Math.max(maxsum,maxtmp);
        }
        return maxsum;
    }
}
