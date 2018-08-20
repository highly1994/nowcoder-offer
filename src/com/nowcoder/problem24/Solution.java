package com.nowcoder.problem24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.nowcoder.domain.TreeNode;

/**
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path=new ArrayList<>();
        if(root==null)return res;
		helper(res,path,root,0,target);
		Collections.sort(res, new Comparator<ArrayList>() {
			@Override
			public int compare(ArrayList o1, ArrayList o2) {
				return o2.size()-o1.size();
			}
		});
		return res;
	}
	
	public void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> path,TreeNode node,int sum,int target) {
		if(node.left==null&&node.right==null) {
			if(sum+node.val==target) {
				ArrayList<Integer> temp=new ArrayList<Integer>(path);
				temp.add(node.val);
				res.add(temp);
				return;
			}else {
				return;
			}
		}
		path.add(node.val);
		if(node.left!=null) {
			helper(res,path,node.left,sum+node.val,target);
		}
		if(node.right!=null) {
			helper(res,path,node.right,sum+node.val,target);
		}
		path.remove(path.size()-1);
	}

}
