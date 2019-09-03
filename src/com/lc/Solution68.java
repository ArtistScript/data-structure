package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution68 <br/>
 * Function:  <br/>
 * Date: 2019-08-30 15:21<br/>
 *
 */
public class Solution68 {
    /**
     * 要点：计算每行单词的时候，行尾不加空格。余下空格补全，并不是均匀分布的。最后一行空格全部补在最后面。
     * @param words
     * @param maxWidth
     * @return
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int cnt=0;//记录总共收录多少单词
        while (cnt<words.length){
            int lineCnt=0;//记录这一行收录多少个数
            StringBuilder line=new StringBuilder();
            int end=cnt;
            boolean lastword=false;
            for(int i=cnt;i<words.length;i++){
                if(lineCnt+words[i].length()+1<=maxWidth){
                    lineCnt+=(1+words[i].length());
                    end++;
                } else if(lineCnt+words[i].length()<=maxWidth){
                    lineCnt+=(words[i].length());
                    end++;
                    lastword=true;
                }
                else break;
            }
            if(!lastword) lineCnt--;
            int yu;
            int chu;
            if(end-cnt>1) {
                chu=(maxWidth-lineCnt)/(end-cnt-1);
                yu=(maxWidth-lineCnt)%(end-cnt-1);//每个地方插入的空格
            }
            else {
                chu=0;
                yu=0;
            }
            if(end!=words.length){//最后一行
                for(int i=cnt;i<end;i++){
                    line.append(words[i]);
                    if(i<end-1) {
                        int zeros=  i-cnt+1<=yu?chu+2:chu+1;
                        for(int j=0;j<zeros;j++)
                        line.append(" ");
                    }
                }
            }else{
                for(int i=cnt;i<end;i++){
                    line.append(words[i]);
                    if(i<end-1) line.append(" ");
                }
            }
            while(line.length()<maxWidth) line.append(" ");
            cnt=end;
            res.add(line.toString());
        }
        return res;
    }
}
