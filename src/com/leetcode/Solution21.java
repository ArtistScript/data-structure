package com.leetcode;

/**
 * ClassName: Solution21 <br/>
 * Function:  <br/>
 * Date: 2019-07-28 11:09<br/>
 *
 */
public class Solution21 {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                ListNode re=new ListNode(-1);
                ListNode head=re;
                ListNode p=l1,q=l2;
                while (p!=null||q!=null){
                        if(q==null||(p!=null&&p.val<q.val)){
                                head.next=p;
                                p=p.next;
                        }else{
                                head.next=q;
                                q=q.next;
                        }
                        head=head.next;
                }
                return re.next;
        }
}
