package com.lc;

/**
 * ClassName: Solution24 <br/>
 * Function:  <br/>
 * Date: 2019-07-31 14:53<br/>
 *
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(-1);
        result.next=head;
        ListNode pre = result;
        ListNode front=null;
        ListNode later=null;
        ListNode oldPre=null;
        ListNode newPre=null;
        while (pre!=null&&pre.next!=null&&pre.next.next!=null){
            //update front, later, pre
            oldPre=pre;
            front=pre.next;
            later=pre.next.next;
            newPre = pre.next.next.next;
            //transfrom the list
            oldPre.next=later;
            later.next=front;
            front.next=newPre;
            pre=front;
        }
        return result.next;
    }
}
