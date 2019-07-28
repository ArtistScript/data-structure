package com.leetcode;

import java.util.Stack;

/**
 * ClassName: Solution20 <br/>
 * Function:  <br/>
 * Date: 2019-07-28 11:08<br/>
 *
 */
public class Solution20 {
        public boolean isValid(String s) {
                char[] charlist=s.toCharArray();
                Stack<Character> st=new Stack<>();
                for(char c:charlist){
                        if(st.empty()) st.push(c);
                        else{
                                switch (c){
                                        case '[':st.push(c);break;
                                        case '(':st.push(c);break;
                                        case '{':st.push(c);break;
                                        case ']': if(st.pop()!='[') return false;break;
                                        case ')':if(st.pop()!='(') return false;break;
                                        case '}':if(st.pop()!='{') return false;break;
                                        default:return false;
                                }
                        }
                }
                return st.size()>0?false:true;
        }
}
