package com.nowcoder.problem15;

import com.nowcoder.domain.ListNode;

/**
 * ����һ��������ת��������������ı�ͷ
 * @author tofuchen
 *
 */
public class Solution {
	
	
	public ListNode ReverseList(ListNode head) {
		if(head==null)return head;
		ListNode node=head.next;
		head.next=null;
		while(node!=null) {
			ListNode next=node.next;
			node.next=head;
			head=node;
			node=next;
		}
		return head;

    }

}
