package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution22 <br/>
 * Function:  <br/>
 * Date: 2019-07-28 11:09<br/>
 *
 */
public class Solution22 {
        public List<String> generateParenthesis(int n) {
                List<String> result=new ArrayList<>();
                generate(result,new StringBuilder(),n,n);
                return result;
        }

        private void generate(List<String> result, StringBuilder sb, int leftPT,int rightPT){
                if(rightPT<leftPT){
                        return;
                }
                else if(leftPT==0&&rightPT==0){
                        result.add(sb.toString());
                }else{
                        if(leftPT>0) {
                                generate(result,sb.append('('),leftPT-1,rightPT);
                                sb.deleteCharAt(sb.length()-1);
                        }
                        if(rightPT>0) {
                                generate(result,sb.append(')'),leftPT,rightPT-1);
                                sb.deleteCharAt(sb.length()-1);
                        }
                }
        }
}
