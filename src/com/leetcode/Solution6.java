package com.leetcode;

/**
 * ClassName: Solution6 <br/>
 * Function: leetcode No.6 <br/>
 * Date: 2019-07-16 21:53<br/>
 *
 */
public class Solution6 {
        /**
         *
         * @param numRows
         * @param row    从0开始算
         * @param down   true向下，false向上
         * @return
         */
        public int add(int numRows,int row,boolean down){
                if(down){
                        return 2*(numRows-row)-2;
                }else{
                        return 2*(row+1)-2;
                }
        }

        /**
         * 我的解法是找规则，找到每行累加的规则
         * 注意边界条件！！！！
         * @param s
         * @param numRows
         * @return
         */
        public String convert(String s, int numRows) {
                if(s==null||s.length()==0||numRows==1) return s;
                StringBuilder sb=new StringBuilder();
                for(int row=0;row<numRows;row++){
                        int index=row;
                        if(index>=s.length()) break;
                        sb.append(s.charAt(index));
                        while (index<s.length()){
                                if(row<numRows-1){
                                        index+=(add(numRows,row,true));
                                        if(index<s.length()) sb.append(s.charAt(index));
                                }
                                if(row>0) {
                                        index += (add(numRows, row, false));
                                        if(index<s.length()) sb.append(s.charAt(index));
                                }
                        }
                }
                return sb.toString();
        }
}
