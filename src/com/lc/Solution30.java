package com.lc;

import java.util.*;

/**
 * ClassName: Solution30 <br/>
 * Function:  <br/>
 * Date: 2019-08-07 14:32<br/>
 *
 */

/**
 * 题意：包括words中得所有单词，单词中间没用多余自父母，字串完全由words中得单词组成（顺序无关）
 *
 * 解法：用多个集合记录words中字符出现得次数，并且只能满足一个集合后，再去满足下一个集合（满足得条件是字母和字母出现得次数都相同）
 * 解法++：因为多有word得长度都一样，所以可以分一样得长度去比较words中是否有相应得字符串
 *
 * 用list查询和删除都比较慢，可以用map去记录需要的和遍历的string次数，map的更新和查询操作都是N(1)，比较快
 */
public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(words.length==0||s.length()==0) return result;
        else{
            int window = words[0].length();
            for(int start=0;start<=s.length()-window*words.length;start++){
                if(isMatch(s,start,new LinkedList<>(Arrays.asList(words)),window)) result.add(start);
            }
        }
        return result;
    }
    private boolean isMatch(String s, int start, List<String> words,int window){
        while (words.size()>0){
            String sub = s.substring(start,start+window);
            if(!words.contains(sub)) return false;
            start=start+window;
            words.remove(sub);
        }
        return true;
    }
}
