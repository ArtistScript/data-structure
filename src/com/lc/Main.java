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
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        a.left=null;
        a.right=b;
        b.left=c;
        List<Integer> res=new Solution94().inorderTraversal(a);
        System.out.println(res);
    }
}
