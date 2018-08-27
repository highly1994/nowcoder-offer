package com.nowcoder.problem62;

import java.util.Stack;

import com.nowcoder.domain.TreeNode;

/**
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4
 * @author tofuchen
 *
 */
public class Solution {
	
	TreeNode KthNode(TreeNode pRoot, int k){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode p=pRoot;
        while(p!=null||!stack.isEmpty()) {
        	while(p!=null) {
        		stack.push(p);
        		p=p.left;
        	}
        	if(!stack.isEmpty()) {
        		p=stack.pop();
        		if(k==1) {
        			return p;
        		}else {
        			k--;
        		}
        		p=p.right;
        	}
        }
        return null;
    }


}
