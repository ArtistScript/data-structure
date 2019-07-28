package com.leetcode;

/**
 * ClassName: Solution104 <br/>
 * Function:  <br/>
 * Date: 2019-07-25 21:26<br/>
 *
 */

public class Solution104 {
        public int maxDepth(TreeNode root) {
                if(root==null) return 0;
                return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
}

class TreeNode {
        int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
