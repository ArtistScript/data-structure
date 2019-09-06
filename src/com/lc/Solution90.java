package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution90 <br/>
 * Function:  <br/>
 * Date: 2019-09-05 11:20<br/>
 *
 */
public class Solution90 {
    /**
     * 和subset1 的区别是包含了重复的元素，开头的元素是否已经选择国（因为有重复），需要判断一下
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        generater(res,new ArrayList<>(),0,nums);
        return res;
    }

    private void generater(List<List<Integer>> res, List<Integer> tmp, int index, int[] nums){
        res.add(new ArrayList<>(tmp));
        //尝试加入后面的数
        for(int i=index;i<nums.length;i++){
            if(i!=index&&nums[i]==nums[i-1]) continue;//数和首位一样，就不用重新当作下一轮的首位
            tmp.add(nums[i]);
            generater(res,tmp,i+1,nums);
            tmp.remove(tmp.size()-1);
        }
    }
}
