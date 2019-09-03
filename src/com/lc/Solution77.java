package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution77 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:27<br/>
 *
 */
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        hepler(res,new ArrayList<>(),1,k,n);
        return res;
    }

    private void hepler(List<List<Integer>> res, List<Integer> tmp,int index,int k,int n){
        if(tmp.size()==k){
            res.add(new ArrayList<>(tmp));
        }else{
            for(int i=index;i<=n;i++){
                tmp.add(i);
                hepler(res,tmp,i+1,k,n);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
