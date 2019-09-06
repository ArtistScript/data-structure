package com.lc;

import java.util.List;

/**
 * ClassName: Solution92 <br/>
 * Function:  <br/>
 * Date: 2019-09-05 16:24<br/>
 *
 */
public class Solution92 {
    //解法：找到需要逆转的头尾,head,tail，找到头尾的边界prev,behind
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //尾
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        ListNode tail=newhead;
        while (n-->0) {
            tail=tail.next;
        }
        ListNode prev=newhead;
        m--;
        while (m-->0) prev=prev.next;
        ListNode re=reverse(prev.next,tail.next);
        prev.next=re;
        return newhead.next;
    }
    private ListNode reverse(ListNode head,ListNode behind){
        ListNode res=new ListNode(0);
        ListNode tail=head;
        while (head!=behind){
            ListNode tmp=head.next;
            head.next=res.next;
            res.next=head;
            head=tmp;
        }
        tail.next=behind;
        return res.next;
    }
}
