package com.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution60 <br/>
 * Function:  <br/>
 * Date: 2019-08-21 16:45<br/>
 *
 */
public class Solution60 {
    public String getPermutation(int n, int k) {
        int[] factorial=new int[n+1];
        int sum=1;
        factorial[0]=sum;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sum*=i;
            factorial[i]=sum;
            numbers.add(i);
        }
        k--;
        StringBuilder res=new StringBuilder();
        for(int i=1;i<=n;i++){
            int index=k/factorial[n-i];
            res.append(numbers.get(index));
            numbers.remove(index);
            k-=index*factorial[n-i];
        }
        return res.toString();
    }
}
