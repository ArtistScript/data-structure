package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution40 <br/>
 * Function:  <br/>
 * Date: 2019-08-13 16:40<br/>
 *
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,result,new ArrayList<>(),0,target);
        return result;
    }
    private void backtrack(int[] candidates,int index,List<List<Integer>> result,List<Integer> tmp,int sum,int target){
        if(sum==target){
            result.add(new ArrayList<>(tmp));
        }else if(sum<target){
            for(int i=index;i<candidates.length;i++){
                if(i>index&&candidates[i]==candidates[i-1]) continue;
                tmp.add(candidates[i]);
                backtrack(candidates,i+1,result,tmp,sum+candidates[i],target);
                tmp.remove(tmp.size()-1);
            }
        }else{
            return ;
        }
    }
}
