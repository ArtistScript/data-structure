package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution39 <br/>
 * Function:  <br/>
 * Date: 2019-08-13 16:16<br/>
 *
 */
public class Solution39 {
    /**
     * 回溯法
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,0,result,new ArrayList<>(),0,target);
        return result;
    }

    private void backtrack(int[] candidates,int index,List<List<Integer>> result,List<Integer> tmp,int sum,int target){
        if(sum==target){
            result.add(new ArrayList<>(tmp));
        }else if(sum<target){
            for(int i=index;i<candidates.length;i++){
                tmp.add(candidates[i]);
                backtrack(candidates,i,result,tmp,sum+candidates[i],target);
                tmp.remove(tmp.size()-1);
            }
        }else{
            return ;
        }
    }
}
