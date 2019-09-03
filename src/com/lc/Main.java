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
        char[][] board=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        boolean res=new Solution79().exist(board,"ABCCED");
        System.out.println(res);
    }
}
