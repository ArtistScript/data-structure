package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution52 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 17:18<br/>
 *
 */
public class Solution52 {
    private int cnt=0;
    public int totalNQueens(int n) {
        int[] place = new int[n];//代表每列的横长度
        boolean[] uesd=new boolean[n];
        backstrack(place,uesd,0,n);
        return cnt;
    }
    private void backstrack( int[] place, boolean[] uesd, int index, int n){
        if(index==n){
            cnt++;
        }else {
            for(int i=0;i<n;i++){//没列放入的值
                //没有使用过，并且皇后排放正确
                if(!uesd[i]&&checkvalid(place,index,i)) {
                    place[index] = i;
                    uesd[i] = true;
                    backstrack( place, uesd, index + 1, n);
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
