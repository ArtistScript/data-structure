package com.lc;

import java.util.List;

/**
 * ClassName: Solution68 <br/>
 * Function:  <br/>
 * Date: 2019-08-30 15:21<br/>
 *
 */
public class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int cnt=0;//记录总共收录多少单词
        while (cnt<words.length){
            int lineCnt=0;//记录这一行收录多少个数
            for(int i=0;i<words.length;i++){
                if(lineCnt+1+words[i].length()<maxWidth){
                    lineCnt+=(1+words[i].length());
                    cnt++;
                }
            }
        }
    }
}
