package com.lc;

/**
 * ClassName: Solution61 <br/>
 * Function:  <br/>
 * Date: 2019-08-22 10:15<br/>
 *
\ */
public class Solution61 {
    /**
     * 原链表在第n-k个节点N后断开，N指向null，最后一个指想头节点
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        int listlen=getLen(head);
        if(listlen==0) return head;
        k=k%listlen;
        if(k==0) return head;
        ListNode pre=head;
        ListNode bh=head;
        while (k-->0){
            pre=pre.next;
        }
        //bh,为n-k个节点的前面一个节点，pre初始值不会是null，因为k！=len
        while (pre.next!=null){
            pre=pre.next;
            bh=bh.next;
        }

        ListNode newHead=bh.next;
        bh.next=null;
        pre.next=head;
        return newHead;
    }
    private int getLen(ListNode head){
        int len=0;
        while (head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
