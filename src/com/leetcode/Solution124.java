package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution124 <br/>
 * Function:  <br/>
 * Date: 2019-07-25 21:32<br/>
 *
 */
public class Solution124 {
        private int maxsum=Integer.MIN_VALUE;
        private Map<TreeNode,Integer> maxNodePath=new HashMap<>();
        public int maxPathSum(TreeNode root) {
                //if left node and right node both null, don't abandon this node ,just return
                if(root.left==null&&root.right==null) return root.val;
                findMaxNodePath(root);
                return maxsum;
        }

        public int findMaxNodePath(TreeNode root){
                if(root==null) {
                        return 0;
                }
                else if(root.left==null&&root.right==null){
                        maxsum=Math.max(root.val,maxsum);
                        return Math.max(root.val,0);// if sum is less than 0, so it is no need to this to upper level,abandon
                }else {
                        int left=findMaxNodePath(root.left);//get the maxsum from down level
                        int right=findMaxNodePath(root.right);
                        maxsum=Math.max(maxsum,Math.max(left,0)+root.val+Math.max(right,0));
                        return Math.max(Math.max(left,right)+root.val,0);////if sum is less than 0, abandon
                }
        }

}
