package com.leetcode;

/**
 * ClassName: Solution23 <br/>
 * Function:  <br/>
 * Date: 2019-07-28 11:10<br/>
 *
 */

import java.util.PriorityQueue;

/**
 * 利用最小堆来选择k个链表第一个数的最小值
 */
public class Solution23 {
        public ListNode mergeKLists(ListNode[] lists) {
                ListNode result = new ListNode(-1);
                PriorityQueue<ListNode> minHeap = new PriorityQueue<>(lists.length);
                ListNode[] heads = new ListNode[lists.length];
                //initialize heads
                for(int i=0;i<lists.length;i++) {
                        heads[i]=lists[i];
                        minHeap.add(lists[i]);
                }
                while (minHeap.size()>0){
                        ListNode minNode=minHeap.poll();
                        int index=-1;
                        for(int i=0;i<heads.length;i++){
                                if(heads[i]==minNode) index=i;
                        }
                }
                return null;
        }
}
