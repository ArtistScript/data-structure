package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: Solution17 <br/>
 * Function: No.17 <br/>
 * Date: 2019-06-20 13:18<br/>
 *
 * @author
 * @version 1.0
 */

/**
 * 除了dfs的解法，还有fifo先进先出，逐个扩展的写法
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/8064/My-java-solution-with-FIFO-queue
 */
public class Solution17 {
        private Map<Character,String> m=new HashMap<>();
        private void appender(String buttons,int index,StringBuilder sb,List<String> result){
                if(index>=buttons.length()){
                        result.add(sb.toString());
                        return;
                }else {
                        for(int i=0;i<m.get(buttons.charAt(index)).length();i++){
                                sb.append(m.get(buttons.charAt(index)).charAt(i));
                                appender(buttons,index+1,sb,result);
                                sb.delete(sb.length()-1,sb.length());
                        }
                }
        }
        public List<String> letterCombinations(String digits) {
                m.put('2',"abc");
                m.put('3',"def");
                m.put('4',"ghi");
                m.put('5',"jkl");
                m.put('6',"mno");
                m.put('7',"pqrs");
                m.put('8',"tuv");
                m.put('9',"wxyz");
                List<String> result=new ArrayList<>();
                if(digits==null||digits.length()==0) return result;
                appender(digits,0,new StringBuilder(),result);
                return result;
        }
        public <T> void fun1(Map<T,Double> m){
                for(Map.Entry<T,Double> en:m.entrySet()){
                        System.out.println((String)en.getKey());
                }
        }
}
