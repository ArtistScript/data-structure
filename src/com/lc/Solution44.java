package com.lc;

/**
 * ClassName: Solution44 <br/>
 * Function:  <br/>
 * Date: 2019-08-14 19:53<br/>
 *
 */
public class Solution44 {
    /**
     * 这题的难点在于遇到*如何处理，遇到*只需要看*之前的字母是否匹配
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        //dp的下表代表的是第几个，并不是字符串中字符的坐标
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int i=1;i<=s.length();i++) dp[i][0]=false;
        for(int i=1;i<=p.length();i++) {
            if(p.charAt(i-1)=='*') dp[0][i]=dp[0][i-1];
        }
        for(int j=1;j<=p.length();j++){
            //每次遍历s之前，都定义一个标志位，查看前面是否匹配。
            //因为只要前面匹配*就可以代替s中的多个字符
            for(int i=1;i<=s.length();i++){
                if(p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    //*代表字符串，为空两种情况
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }else{
                    if(s.charAt(i-1)==p.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                    else dp[i][j]=false;
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
