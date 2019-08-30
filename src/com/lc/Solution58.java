package com.lc;

/**
 * ClassName: Solution58 <br/>
 * Function:  <br/>
 * Date: 2019-08-21 10:57<br/>
 *
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        int start=s.length()-1;
        int end=s.length()-1;
        int length=0;
        int i=0;
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                start=i;
                //更新之前字母长度
                length=end-start>0?end-start:length;
                //更新标志位
                end=i-1;
            }else if(i==0){
                start=i;
                length=end-start+1>0?end-start+1:length;
            }
            if(length>0) break;
        }
        return length;
    }
}
