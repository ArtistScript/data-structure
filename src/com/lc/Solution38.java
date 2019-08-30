package com.lc;

/**
 * ClassName: Solution38 <br/>
 * Function:  <br/>
 * Date: 2019-08-13 16:01<br/>
 *
 */

/**
 * 按照逻辑实现就可以了
 */
public class Solution38 {
    public String countAndSay(int n) {
        String pre="1";
        while (n-->1){
            pre=nextStr(pre);
        }
        return pre;
    }
    private String nextStr(String pre){
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        char num=pre.charAt(0);
        for(int i=1;i<pre.length();i++){
            if(pre.charAt(i)==num){
                cnt++;
            }else{
                sb.append(cnt);
                sb.append(num);
                cnt=1;
                num=pre.charAt(i);
            }
        }
        if(cnt>0) sb.append(cnt);
        sb.append(num);
        return sb.toString();
    }
}
