package com.nowcoder.problem57;

import com.nowcoder.domain.TreeLinkNode;

/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ��
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode==null)return null;
        if(pNode.right!=null) {
        	TreeLinkNode node=pNode.right;
        	while(node.left!=null) {
        		node=node.left;
        	}
        	return node;
        }
        if(pNode.next==null) {
        	return null;
        }
        if(pNode.next.left==pNode) {
        	return pNode.next;
        }
        TreeLinkNode father=pNode.next;
        while(father!=null&&father.left!=pNode) {
        	pNode=father;
        	father=father.next;
        }
        return father;
    }

}
