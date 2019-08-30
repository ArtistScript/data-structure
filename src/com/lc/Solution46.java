package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution46 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 15:17<br/>
 *
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        boolean used[]=new boolean[nums.length];
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> tmpList=new ArrayList<>();
        backstracking(result,tmpList,used,nums);
        return result;
    }

    private void backstracking(List<List<Integer>> result, List<Integer> tmpList,boolean used[],int[] nums){
        if(tmpList.size()==nums.length){
            result.add(new ArrayList<>(tmpList));
        }else{
            for(int i=0;i<nums.length;i++){
                if(used[i]) continue;
                else{
                    tmpList.add(nums[i]);
                    used[i]=true;
                    backstracking(result,tmpList,used,nums);
                    used[i]=false;
                    tmpList.remove(tmpList.size()-1);
                }
            }
        }
    }
}
