package com.leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Solution151 <br/>
 * Function: leetcode No.151 <br/>
 * Date: 2019-07-14 16:30<br/>
 *
 */
public class Solution151 {
        /**
         * 简单粗暴法：用split分割，逆序，然后输出想要的字符串
         * 精细法：   逆转整个数组，然后逆转每个单词，最后去掉多余空格
         * @param s
         * @return
         */
        public String reverseWords(String s) {
                String[] splitted=s.trim().split("\\s");
                List<String> splittedstr=new ArrayList<>(Arrays.asList(splitted));
                Collections.reverse(splittedstr);
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<splittedstr.size();i++){
                        sb.append(splittedstr.get(i));
                        if(i<splittedstr.size()-1) sb.append(" ");
                }
                return sb.toString();
        }
}
