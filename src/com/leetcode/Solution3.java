package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> record=new HashMap();
        int start=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            if(record.containsKey(s.charAt(i))){
                start=Math.max(start,record.get(s.charAt(i))+1);
            }
            record.put(s.charAt(i),i);
            maxlen=Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
    public static void main(String[] args){
        String s="abba";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }
}
