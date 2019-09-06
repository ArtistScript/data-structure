package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution89 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 19:56<br/>
 *
 */
public class Solution89 {
    /**
     * 解法：用递归，产出各个位置的bit
     * 答案：The idea is simple. G(i) = i^ (i/2).
     * @param n
     * @return
     */
    public List<Integer> grayCode(int n) {
        List<List<Integer>> arrays=generater(n);
        List<Integer> res=new ArrayList<>();
        for(List<Integer> array:arrays){
            res.add(changeArraystoInt(array));
        }
        return res;
    }

    private Integer changeArraystoInt(List<Integer> arrays){
        int res=0;
        for(int i=0;i<arrays.size();i++){
            res*=2;
            res+=arrays.get(i);
        }
        return res;
    }

    private List<List<Integer>> generater(int n){
        if(n==1){
            List<List<Integer>> res=new ArrayList<>();
            for(int i=0;i<2;i++){
                List<Integer> tmp=new ArrayList<>();
                tmp.add(i);
                res.add(tmp);
            }
            return res;
        }else if(n==0){
            List<List<Integer>> res=new ArrayList<>();
            for(int i=0;i<1;i++){
                List<Integer> tmp=new ArrayList<>();
                tmp.add(i);
                res.add(tmp);
            }
            return res;
        }else{
            List<List<Integer>> res1=generater(n/2);
            List<List<Integer>> res2=generater(n-n/2);
            List<List<Integer>> res=new ArrayList<>();
            for(int i=0;i<res1.size();i++){
                for(int j=0;j<res2.size();j++){
                    //拼接两个result，两种拼接方式循环进行，可以达到数字相差为1
                    List<Integer> tmp=new ArrayList<>();
                    if(i%2==0){
                        tmp.addAll(res1.get(i));
                        tmp.addAll(res2.get(j));
                    }else {
                        tmp.addAll(res1.get(i));
                        tmp.addAll(res2.get(res2.size()-j-1));
                    }
                    res.add(tmp);
                }
            }
            return res;
        }
    }
}
