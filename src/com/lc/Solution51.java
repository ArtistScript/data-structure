package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution51 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 16:37<br/>
 *
 */
public class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        int[] place = new int[n];//代表每列的横长度
        boolean[] uesd=new boolean[n];
        List<List<String>> res=new ArrayList<>();
        backstrack(res,place,uesd,0,n);
        return res;
    }

    private void backstrack(List<List<String>> res,int[] place,boolean[] uesd,int index,int n){
        if(index==n){
            List<String> tmp=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(j==place[i]) sb.append('Q');
                    else sb.append('.');
                }
                tmp.add(sb.toString());
            }
            res.add(tmp);
        }else {
            for(int i=0;i<n;i++){//没列放入的值
                //没有使用过，并且皇后排放正确
                if(!uesd[i]&&checkvalid(place,index,i)) {
                    place[index] = i;
                    uesd[i] = true;
                    backstrack(res, place, uesd, index + 1, n);
                    uesd[i] = false;
                }
            }
        }
    }

    private boolean checkvalid(int[] place,int index,int value){
        for(int i=0;i<index;i++){
            if(Math.abs(index-i)==Math.abs(value-place[i])) return false;
        }
        return true;
    }
}
