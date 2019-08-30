package com.lc;

/**
 * ClassName: Solution29 <br/>
 * Function:  <br/>
 * Date: 2019-08-01 14:36<br/>
 *
 */

/**
 * 只有dividend是-2^31，并且divisor是-1的时候会溢出
 */
public class Solution29 {
    /**
     * 使用移位代替乘法，记录移位的位数
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        int flag = dividend>0^divisor>0?-1:1;
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        long ddl=Math.abs((long)dividend);
        long drl=Math.abs((long)divisor);
        int sum=0;
        long tempdividend=ddl;
        while(tempdividend>=drl){
            int shift=0;
            while (drl<<shift<=tempdividend){
                shift+=1;
            }
            tempdividend-=drl<<(shift-1);
            sum+=1<<(shift-1);
        }
        return flag*sum;
    }
}
