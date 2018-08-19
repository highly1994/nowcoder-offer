package com.nowcoder.problem16;

import com.nowcoder.domain.ListNode;

/**
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1==null)return list2;
		if(list2==null)return list1;
		ListNode head=new ListNode(0);
		ListNode node=head;
		while(list1!=null&&list2!=null) {
			if(list1.val<list2.val) {
				node.next=list1;
				node=list1;
				list1=list1.next;
			}else {
				node.next=list2;
				node=list2;
				list2=list2.next;
			}
		}
		if(list1!=null) {
			node.next=list1;
		}else {
			node.next=list2;
		}
		return head.next;
	}

}
