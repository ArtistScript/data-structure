package com.lc;

/**
 * ClassName: Solution80 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 17:22<br/>
 *
 */
public class Solution80 {
    /**
     * 利用计数法，和之前去掉数组中重复的数是一样的
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int length=0;
        int quified=0;
        int prev=-1;//记录之前的一个数字
        int numCnt=0;//记录相同数字出现的次数
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prev=nums[i];
                numCnt=1;
                nums[quified++]=nums[i];
            }else{
                if(nums[i]==prev) numCnt++;
                else {
                    prev=nums[i];
                    numCnt=1;
                }
                if(numCnt<=2) nums[quified++]=nums[i];
            }
        }
        return quified;
    }
}
