package com.nowcoder.problem18;

import com.nowcoder.domain.TreeNode;

/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public void Mirror(TreeNode root) {
		if(root==null)return;
		Mirror(root.right);
		Mirror(root.left);
		TreeNode node=root.left;
		root.left=root.right;
		root.right=node;
	}

}
