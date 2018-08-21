package com.nowcoder.problem25;

import com.nowcoder.domain.RandomListNode;
/**
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		RandomListNode node=new RandomListNode(0);
		RandomListNode node1=new RandomListNode(1);
		RandomListNode node2=new RandomListNode(2);
		RandomListNode node3=new RandomListNode(3);
		RandomListNode node4=new RandomListNode(4);
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node.random=node2;
		node1.random=node4;
		node4.random=node1;
		System.out.println(new Solution().Clone(node));
	}
	
	
	public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)return null;
        RandomListNode node=pHead;
        RandomListNode next=node.next;
        while(node!=null) {
        	next=node.next;
        	RandomListNode newNode=new RandomListNode(node.label);
        	node.next=newNode;
        	newNode.next=next;
        	node=next;
        }
        node=pHead;
        while(node!=null) {
        	RandomListNode newNode=node.next;
        	if(node.random==null) {
        		newNode.random=null;
        	}else {
        		newNode.random=node.random.next;
        	}
        	node=newNode.next;
        }
        node=pHead;
        RandomListNode resHead=new RandomListNode(0);
        RandomListNode resTail=resHead;
        while(node!=null) {
        	resTail.next=node.next;
        	resTail=resTail.next;
        	node=resTail.next;
        }
        return resHead.next;
    }

}
