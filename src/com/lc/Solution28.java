package com.lc;

/**
 * ClassName: Solution28 <br/>
 * Function:  <br/>
 * Date: 2019-08-01 14:22<br/>
 *
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        for(int i=0;i<haystack.length();i++){
            if(i+needle.length()>haystack.length()) return -1;
            if(haystack.substring(i,i+needle.length()).equals(needle)) return i;
            else continue;
        }
        return -1;
    }
}
