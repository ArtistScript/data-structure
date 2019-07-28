package com.leetcode;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution2 {
    private int getlength(ListNode l){
        int length=0;
        while (l!=null){
            l=l.next;
            length++;
        }
        return length;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1=getlength(l1);
        int len2=getlength(l2);
        ListNode result=new ListNode(0);
        ListNode head=result;
        if(len1<len2){//假定l1都比l2长
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        int c=0;
        while (l2!=null){
            int sum=c+l1.val+l2.val;
            result.next=new ListNode(sum%10);
            c=sum/10;
            l1=l1.next;
            l2=l2.next;
            result=result.next;
        }
        while (l1!=null){
            int sum=c+l1.val+0;
            result.next=new ListNode(sum%10);
            c=sum/10;
            l1=l1.next;
//            l2=l2.next;
            result=result.next;
        }
        while (c!=0){
            result.next=new ListNode(c%10);
            c=c/10;
            result=result.next;
        }
        return head.next;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(4);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(5);
        ListNode e=new ListNode(6);
        ListNode f=new ListNode(4);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        ListNode result=new Solution2().addTwoNumbers(a,d);
        while (result.next!=null){
            System.out.println(result.next.val);
            result=result.next;
        }

    }
}
