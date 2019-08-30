package com.lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Solution66 <br/>
 * Function:  <br/>
 * Date: 2019-08-23 11:38<br/>
 *
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {int index=digits.length-1;
        while(index>=0){
            if(digits[index]==9) index--;
            else break;
        }
        if(index==-1){
            int[] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        else{
            digits[index]+=1;
            for(int i=index+1;i<digits.length;i++){
                digits[i]=0;
            }
            return digits;
        }

    }
}
