package com.lc;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName: Solution23 <br/>
 * Function:  <br/>
 * Date: 2019-07-29 11:27<br/>
 *
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

/**
 * 原来的做法是从最小堆中获取一个节点，再看节点来自哪个list，取next
 * 改进：并不需要看节点来自哪个list，节点自身就可以取next
 */
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(-1);
        ListNode head=result;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val>o2.val) return 1;
                else if(o1.val<o2.val) return -1;
                else return 0;
            }
        });
        //initialize heads
        for(int i=0;i<lists.length;i++) {
            if(lists[i]==null) continue;;
            minHeap.add(lists[i]);
        }
        while (minHeap.size()>0){
            ListNode minNode=minHeap.poll();
            head.next=minNode;
            //update heads and heap
            if(minNode.next!=null){
                minHeap.add(minNode.next);
            }
            head=head.next;
        }
        return result.next;
    }
}
