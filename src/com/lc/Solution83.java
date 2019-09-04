package com.lc;

/**
 * ClassName: Solution83 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 11:35<br/>
 *
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=head;
        while (head!=null){
            if(head.next!=null&&head.next.val==head.val){
                deleteNextNode(head);
            }else {
                head = head.next;
            }
        }
        return res;
    }
    private void deleteNextNode(ListNode preNode){
        preNode.next=preNode.next.next;
    }
}
