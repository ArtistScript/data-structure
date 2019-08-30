package com.lc;

/**
 * ClassName: Solution32 <br/>
 * Function:  <br/>
 * Date: 2019-08-07 15:19<br/>
 *
 */

import java.util.Stack;

/**
 * 最长匹配括号字串
 * 解法：用堆来保存为匹配的字符，在遍历过程中消去堆中可以匹配的字符。
 * 最后遍历一遍堆，留下的是不能匹配的字符
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(i);
            }else{
                if(s.charAt(i)==')'){
                    if(s.charAt(st.peek())=='(') st.pop();
                    else st.push(i);
                }else{
                    st.push(i);
                }
            }
        }
        //遍历不能消去的字符，获得匹配字串的最大长度
        int maxlength=-1;
        int lastend=s.length();
        if(st.empty()) return s.length();
        else{
            while (!st.empty()){
                int index=st.pop();
                maxlength=Math.max(maxlength,lastend-index-1);
                lastend=index;
            }
        }
        maxlength=Math.max(lastend-0,maxlength);
        return maxlength;
    }
}
