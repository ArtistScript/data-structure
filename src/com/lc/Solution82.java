package com.lc;

/**
 * ClassName: Solution82 <br/>
 * Function:  <br/>
 * Date: 2019-09-04 11:16<br/>
 *
 */
public class Solution82 {
    /**
     * 删除所有重复的元素，不保留
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode pre=res;
        while (head!=null){
            boolean repeat=false;
            while (head.next!=null&&head.val==head.next.val){
                deleteNextNode(head);//删除后面和这个点重复的点
                repeat=true;
            }
            if(repeat) {
                pre.next=head.next;
            }//删除这个点
            else{
                pre=head;
            }
            head=head.next;
        }
        return res;
    }

    private void deleteNextNode(ListNode preNode){
        preNode.next=preNode.next.next;
    }
}
