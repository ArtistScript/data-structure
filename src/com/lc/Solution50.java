package com.lc;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution50 <br/>
 * Function:  <br/>
 * Date: 2019-08-16 16:11<br/>
 *
 */
public class Solution50 {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        if(n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0)?myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}
