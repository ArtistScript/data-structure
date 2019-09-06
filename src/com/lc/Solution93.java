package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution93 <br/>
 * Function:  <br/>
 * Date: 2019-09-05 16:46<br/>
 *
 */
public class Solution93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        helper(result,new ArrayList<>(),0,s);
        return result;
    }
    private void helper(List<String> result,List<String> tmp,int start,String s){
        if(start==s.length()&&tmp.size()==4){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<tmp.size();i++){
                sb.append(tmp.get(i));
                if(i<tmp.size()-1){
                    sb.append('.');
                }
            }
            result.add(sb.toString());
        }else if(tmp.size()>=4) return;
        else{
            //数字的长度
            for(int i=1;i<=3&&start+i<=s.length();i++){
                String sub=s.substring(start,start+i);
                if(Integer.valueOf(sub)<=255){
                    if(sub.length()>1&&sub.charAt(0)=='0') continue;
                    tmp.add(sub);
                    helper(result,tmp,start+i,s);
                    tmp.remove(tmp.size()-1);
                }
            }
        }
    }
}
