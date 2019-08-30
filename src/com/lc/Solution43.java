package com.lc;

/**
 * ClassName: Solution43 <br/>
 * Function:  <br/>
 * Date: 2019-08-14 15:52<br/>
 *
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        if(num1.length()<num2.length()){
            String temp=num1;
            num1=num2;
            num2=temp;
        }
        String tmpre="0";
        for(int i=0;i<num2.length();i++){
            String mc = muliplyChar(num1,num2.charAt(num2.length()-1-i),i);
            tmpre=add(tmpre,mc);
        }
        return tmpre;
    }

    public String muliplyChar(String num1, char c, int base){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<base;i++) sb.append('0');
        int carry=0;
        for(int i=num1.length()-1;i>=0;i--){
            int sum=(c-48)*(num1.charAt(i)-48)+carry;
            carry=sum/10;
            sb.append(sum%10);
        }
        while (carry!=0){
            sb.append(carry%10);
            carry/=10;
        }
        while (sb.length()>0&&sb.charAt(sb.length()-1)=='0') sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        return sb.toString();
    }

    public String add(String num1,String num2){
        int carry=0;
        int l1=num1.length();
        int l2=num2.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(;i<Math.min(num1.length(),num2.length());i++){
            int sum=num1.charAt(l1-1-i)+num2.charAt(l2-1-i)-48*2+carry;
            carry=sum/10;
            sb.append(sum%10);
        }
        while(i<num1.length()){
            int sum=num1.charAt(l1-1-i)-48+carry;
            carry=sum/10;
            sb.append(sum%10);
            i++;
        }
        while(i<num2.length()){
            int sum=num2.charAt(l2-1-i)-48+carry;
            carry=sum/10;
            sb.append(sum%10);
            i++;
        }
        while (carry!=0){
            sb.append(carry%10);
            carry/=10;
        }
        return sb.reverse().toString();
    }
}
