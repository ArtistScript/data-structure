package com.leetcode;

/**
 * ClassName: Solution8 <br/>
 * Function: leetcode No8 <br/>
 * Date: 2019-07-17 20:41<br/>
 *
 */
public class Solution8 {
        public int myAtoi(String str) {
                char[] strchar=str.trim().toCharArray();
                int flag=1;
                int res=0;
                for(int i=0;i<strchar.length;i++){
                        if(i==0&&strchar[0]=='+'){
                                flag=1;
                        }else if(i==0&&strchar[0]=='-'){
                                flag=-1;
                        }else{
                                try {
                                        int charint=Integer.parseInt(strchar[i]+"");
                                        int newres=(10*res+charint);
                                        if((newres-charint)/10!=res) return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                                        res=newres;
                                } catch (NumberFormatException e) {
                                        return flag*res;
                                }
                        }
                }
                if(res==Integer.MIN_VALUE){
                        return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }else if(res<0){
                        return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                return flag*res;
        }
}
