package com.leetcode;

import com.leetcode.Solution2.*;
/**
 * ClassName: Solution19 <br/>
 * Function:  <br/>
 * Date: 2019-07-24 22:30<br/>
 *
 *
 */

public class Solution19 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode fastN=head;
                while (n-->0) fastN=fastN.next;
                ListNode slowN=head;
                if(fastN==null) return head.next;
                while (fastN.next!=null){
                        fastN=fastN.next;
                        slowN=slowN.next;
                }
                slowN.next=slowN.next.next;
                return head;
        }
}
