package com.nowcoder.problem14;

import com.nowcoder.domain.ListNode;

/**
 * ����һ����������������е�����k����㡣
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode node=head;
		int i=0;
		while(i<k&&node!=null) {
			node=node.next;
			i++;
		}
		if(i<k&&node==null) {
			return null;
		}
		while(node!=null) {
			head=head.next;
			node=node.next;
		}
		return head;
	}

}
