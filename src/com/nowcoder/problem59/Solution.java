package com.nowcoder.problem59;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import com.nowcoder.domain.TreeNode;

/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ�����
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		LinkedList<TreeNode> nodes=new LinkedList<>();
		if(pRoot==null)return res;
		nodes.add(pRoot);
		TreeNode last=pRoot;
		while(!nodes.isEmpty()) {
			last=nodes.get(nodes.size()-1);
			ArrayList<Integer> list=new ArrayList<>();
			TreeNode node=nodes.poll();
			while(node!=last) {
				list.add(node.val);
				if(node.left!=null) nodes.add(node.left);
				if(node.right!=null) nodes.add(node.right);
				node=nodes.poll();
			}
			list.add(node.val);
			if(node.left!=null) nodes.add(node.left);
			if(node.right!=null) nodes.add(node.right);
			res.add(list);
		}
		for(int i=0;i<res.size();i++) {
			if(i%2==1) {
				Collections.reverse(res.get(i));
			}
		}
		return res;
    }
}
