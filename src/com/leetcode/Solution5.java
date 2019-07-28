package com.leetcode;
import java.util.Arrays;

/**
 * ClassName: Solution5 <br/>
 * Function: leetcode No5 <br/>
 * Date: 2019-06-11 22:38<br/>
 *
 * @author
 * @version 1
 */
public class Solution5 {
        /**
         * 动态规划解法 dp[i,j] 下标i到j是否回文，0 否，1 是
         * dp[i+1,j]=(dp[i+1,j]&&s[j]==s[i])
         *
         * 很神奇，i要从右到左才行
         * @param s
         * @return
         */
        //i减小，j增大的原因。算之前状态的时候是需要i增大，j减小。所以外层循环i减小，j增大，能保证子状态都被计算到过
        public String longestPalindrome(String s) {
                String result="";
                boolean[][] dp=new boolean[s.length()][s.length()];
                for(int i=s.length()-1;i>=0;i--){
                        for (int j=i;i+j<s.length();j++){
                                dp[i][j]=s.charAt(i)==s.charAt(j)&&(j-i<2||dp[i+1][j-1]);
                                if(dp[i][j]&&j-i+1>result.length()) result=s.substring(i,j+1);
                        }
                }
                return result;
        }
}
