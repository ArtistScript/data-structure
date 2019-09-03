package com.lc;

/**
 * ClassName: Solution76 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 16:26<br/>
 *
 */
public class Solution76 {
    /**
     *
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        int[] map=new int[128];//记录t中各字母的个数
        for(char c:t.toCharArray()) map[(int)c]++;
        int counter=t.length(), begin=0, end=0, d=Integer.MAX_VALUE, head=0;
        while (end<s.length()){
            if(map[s.charAt(end++)]-->0) counter--;//记录包含的t字母数
            while (counter==0){
                if(end-begin<d) d=end-(head=begin);
                if(map[s.charAt(begin++)]++==0) counter++;//如果放入的是无关字母，那么map里的值应该小于0
            }
        }

        return d==Integer.MAX_VALUE?"":s.substring(head,head+d);
    }
}
