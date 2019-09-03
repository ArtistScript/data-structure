package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution78 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:37<br/>
 *
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        hepler(res,new ArrayList<>(),0,nums);
        return res;
    }
    private void hepler(List<List<Integer>> res, List<Integer> tmp,int index,int[] nums){
        if(index==nums.length){
            res.add(new ArrayList<>(tmp));
        }else{
            tmp.add(nums[index]);
            hepler(res,tmp,index+1,nums);
            tmp.remove(tmp.size()-1);
            hepler(res,tmp,index+1,nums);
        }
    }
}
