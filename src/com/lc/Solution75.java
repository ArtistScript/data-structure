package com.lc;

/**
 * ClassName: Solution75 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:04<br/>
 *
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int zero=0;//未确定是0
        int two=nums.length-1;//未确定是0
        int index=0;
        while (index<=two){
            if(nums[index]==0){
                nums[index]=nums[zero];
                nums[zero]=0;
                zero++;
                index--;
            }else if(nums[index]==2){
                nums[index]=nums[two];
                nums[two]=2;
                two--;
                index--;
            }else{

            }
            index++;
        }
    }
}
