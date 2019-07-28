package com.leetcode;

/**
 * ClassName: Solution10 <br/>
 * Function:  <br/>
 * Date: 2019-07-19 15:51<br/>
 *
 */

/**
 * 利用动态规划，但是在 '*'情况下写的有些繁琐
 *
 * 参考答案的，"*"情况下要简洁一些
 * https://leetcode.com/problems/regular-expression-matching/discuss/5651/Easy-DP-Java-Solution-with-detailed-Explanation
 */
public class Solution10 {
        public boolean isMatch(String s, String p) {
                boolean[][] dp=new boolean[s.length()+1][p.length()+1];
                //dp的索引代表着原来字符串的第i个
                dp[0][0]=true;
                for(int i=1;i<=s.length();i++) {
                        dp[i][0]=false;
                }
                //
                for(int i=1;i<=p.length();i++) {
                        if(p.charAt(i-1)=='*'&&i>=2) dp[0][i]=dp[0][i-2];
                        else dp[0][i]=false;
                }

                for(int i=1;i<=s.length();i++){
                        for(int j=1;j<=p.length();j++){

                                if(p.charAt(j-1)=='*'){
                                        dp[i][j]=(j>=2&&(dp[i][j-2]))||//前面字母出现零次
                                                dp[i][j-1]||//前面字母出现一次
                                                (dp[i-1][j-1]&&(s.charAt(i-1)==s.charAt(i-2)||p.charAt(j-2)=='.'))||//前面字母出现两次
                                                (p.charAt(j-2)=='.'&&dp[i-1][j]);//前面的不是字符，是'.'
                                }else if(p.charAt(j-1)=='.'){
                                        dp[i][j]=(dp[i-1][j-1]);
                                }else{
                                        dp[i][j]=dp[i-1][j-1]&&s.charAt(i-1)==p.charAt(j-1);
                                }

                        }
                }
                return dp[s.length()][p.length()];
        }
}
