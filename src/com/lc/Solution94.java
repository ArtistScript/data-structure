package com.lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName: Solution94 <br/>
 * Function:  <br/>
 * Date: 2019-09-05 17:06<br/>
 *
 */
public class Solution94 {
    //中序遍历是第二次遇到元素的时候访问，左边有元素加入，访问，右边有元素加入
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        s.add(root);
        while (!s.empty()){
            TreeNode first=s.peek();
            while (first!=null){
                if(first.left!=null) s.add(first.left);
                first=first.left;
            }
            TreeNode second=s.pop();
            result.add(second.val);
            while (second!=null){
                if(second.right!=null) s.add(second.right);
                second=second.right;
            }
        }
        return result;
    }
}
