package com.lc;

import java.util.*;

/**
 * ClassName: Solution49 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 15:57<br/>
 *
 */
public class Solution49 {
    //先排序，再用set去重
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> m= new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            List<String> list=m.getOrDefault(key,new ArrayList<>());
            list.add(s);
            m.put(key,list);
        }
        return new ArrayList<List<String>>(m.values());
    }
}
