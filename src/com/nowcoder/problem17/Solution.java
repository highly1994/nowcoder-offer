package com.nowcoder.problem17;

import com.nowcoder.domain.TreeNode;

/**
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2==null||root1==null)return false;
        if(equals(root1,root2))return true;
        else {
        	return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
        }
    }
	
	private boolean equals(TreeNode root1,TreeNode root2) {
		if(root1==null&&root2==null)return true;
		if(root1==null)return false;
		if(root2==null)return true;
		if(root1.val!=root2.val)return false;
		if(!equals(root1.left,root2.left)||!equals(root1.right,root2.right))return false;
		return true;
	}

}
