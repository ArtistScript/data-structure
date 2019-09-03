package com.lc;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * ClassName: Main <br/>
 * Function:  <br/>
 * Date: 2019-07-29 11:26<br/>
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{};
        int res=new Solution80().removeDuplicates(nums);
        System.out.println(res);
    }
}
