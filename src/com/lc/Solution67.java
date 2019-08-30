package com.lc;

/**
 * ClassName: Solution67 <br/>
 * Function:  <br/>
 * Date: 2019-08-23 17:15<br/>
 *
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        int i=0;
        for( i=0;i<a.length()&&i<b.length();i++){
            c=a.charAt(a.length()-1-i)+b.charAt(b.length()-1-i)-2*'0'+c;
            sb.append(c%2);
            c=(c/2);
        }
        while (i<a.length()){
            c=a.charAt(a.length()-1-i)-'0'+c;
            sb.append(c%2);
            c=(c/2);
            i++;
        }
        while (i<b.length()){
            c=b.charAt(b.length()-1-i)-'0'+c;
            sb.append(c%2);
            c=(c/2);
            i++;
        }
        while (c!=0){
            sb.append(c%2);
            c/=2;
        }
        return sb.reverse().toString();

    }
}
