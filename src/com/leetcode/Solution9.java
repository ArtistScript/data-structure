package com.leetcode;

/**
 * ClassName: Solution9 <br/>
 * Function:  <br/>
 * Date: 2019-07-17 21:35<br/>
 *
 */

/**
 * 这种数字的题目，用位运算是最快的，用字符串很慢
 *
 */
public class Solution9 {
        public boolean isPalindrome(int x) {
                char[] cc=String.valueOf(x).toCharArray();
                int left=0,right=cc.length-1;
                while (left<right){
                        if(cc[left++]!=cc[right--]) return false;
                }
                return true;
        }
}
