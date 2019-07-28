package com.leetcode;

import javax.transaction.TransactionRequiredException;

/**
 * ClassName: Solution687 <br/>
 * Function:  <br/>
 * Date: 2019-07-28 10:11<br/>
 *
 */

/**
 * 注意更新最大值，和函数返回值的区别
 */
public class Solution687 {
        int maxLength=Integer.MIN_VALUE;
        public int longestUnivaluePath(TreeNode root) {
                if(root==null||(root.left==null&&root.right==null)) return 0;
                int maRootLength=maxLongestNodePath(root);
                return maxLength;
        }

        private int maxLongestNodePath(TreeNode root){
                if(root.left==null&&root.right==null){
                   maxLength=Math.max(maxLength,0);
                   return 0;
                }else{
                        int left =-1;
                        int right=-1;
                        if(root.left!=null) left = maxLongestNodePath(root.left);
                        if(root.right!=null) right = maxLongestNodePath(root.right);
                        // both sides is invalid
                        if((root.left!=null&&root.val==root.left.val)&&(root.right!=null&&root.val==root.right.val)){
                                maxLength=Math.max(maxLength,right+left+2);//但是更新的时候一定要两条边一起更新
                                return Math.max(right,left)+1;//选择最大的一条边返回
                        }
                        //left side is invalid
                        else if(root.left!=null&&root.val==root.left.val){
                                maxLength=Math.max(maxLength,left+1);
                                return left+1;
                        }else if(root.right!=null&&root.val==root.right.val){//right side is invalid
                                maxLength=Math.max(maxLength,right+1);
                                return right+1;
                        }else{
                                maxLength=Math.max(maxLength,0);
                                return 0;
                        }

                }
        }
}
