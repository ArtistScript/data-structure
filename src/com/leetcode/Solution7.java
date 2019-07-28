package com.leetcode;

/**
 * ClassName: Solution7 <br/>
 * Function: Leetcode No.7 <br/>
 * Date: 2019-07-17 20:27<br/>
 *
 * @version 1.0
 *
 */

/**
 * 使用倒取余法，效率会更加高
 */
public class Solution7 {
        public int reverse(int x) {
                boolean fu=false;
                if(x<0){
                        x=-x;
                        fu=true;
                }
                StringBuilder sb=new StringBuilder(String.valueOf(x));
                sb.reverse();
                int res;
                try {
                        res=Integer.parseInt(sb.toString());
                } catch (NumberFormatException e) {
                        return 0;
                }
                return fu?-res:res;
        }
}
