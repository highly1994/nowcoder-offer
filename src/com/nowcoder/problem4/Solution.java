package com.nowcoder.problem4;

import com.nowcoder.domain.TreeNode;

/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * @author CDF
 *
 */
public class Solution {
	
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return helper(pre,0,pre.length-1,in,0,in.length);
	}
	
	private TreeNode helper(int[] pre,int preleft,int preright,int[] in,int inleft,int inright){
		if(preleft>preright||inleft>inright)return null;
		if(preleft==preright&&inleft==inright)return new TreeNode(pre[preleft]);
		int root=pre[preleft];
		TreeNode res=new TreeNode(root);
		int index=inleft;
		for(;index<=inright;index++){
			if(in[index]==root)break;
		}
		res.left=helper(pre,preleft+1,preleft+index-inleft,in,inleft,index-1);
		res.right=helper(pre,preleft+index-inleft+1,preright,in,index+1,inright);
		return res;
	}

}
