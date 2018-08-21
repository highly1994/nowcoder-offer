package com.nowcoder.problem26;

import com.nowcoder.domain.TreeNode;

/**
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)return null;
		return helper(pRootOfTree)[0];
	}
	
	public TreeNode[] helper(TreeNode root) {
		if(root.left==null&&root.right==null) {
			return new TreeNode[] {root,root};
		}
		if(root.left==null) {
			TreeNode[] right=helper(root.right);
			root.right=right[0];
			right[0].left=root;
			return new TreeNode[] {root,right[1]};
		}else if(root.right==null) {
			TreeNode[] left=helper(root.left);
			root.left=left[1];
			left[1].right=root;
			return new TreeNode[] {left[0],root};
		}else {
			TreeNode[] right=helper(root.right);
			root.right=right[0];
			right[0].left=root;
			TreeNode[] left=helper(root.left);
			root.left=left[1];
			left[1].right=root;
			return new TreeNode[] {left[0],right[1]};
		}
		
	}

}
