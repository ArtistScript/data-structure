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
        int[] nums1=new int[]{1,2,3,0,0,0};
        int[] nums2=new int[]{2,5,6};
        new Solution88().merge(nums1,3,nums2,3);
        System.out.println();
    }
}
