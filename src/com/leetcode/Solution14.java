package com.leetcode;

/**
 * ClassName: Solution14 <br/>
 * Function:  <br/>
 * Date: 2019-07-23 22:29<br/>
 *
 */
public class Solution14 {
        public String longestCommonPrefix(String[] strs) {
                StringBuilder sb=new StringBuilder();
                if(strs.length==0) return sb.toString();
                if(strs.length==1) return strs[0];
                try {
                        for(int i=0;i<Integer.MAX_VALUE;i++){
                                char flag=strs[0].charAt(i);
                                for(int j=1;j<strs.length;j++){
                                        if(flag!=strs[j].charAt(i)) return sb.toString();
                                }
                                sb.append(flag);
                        }
                } catch (Exception e) {
                        return sb.toString();
                }
                return sb.toString();
        }
}
