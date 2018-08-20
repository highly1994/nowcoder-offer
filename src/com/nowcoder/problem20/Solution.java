package com.nowcoder.problem20;

import java.util.ArrayList;
/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1����
 * @author tofuchen
 *
 */
public class Solution {
	
	private ArrayList<Integer> numlist=new ArrayList<Integer>();
	private ArrayList<Integer> minlist=new ArrayList<Integer>();
	
	public void push(int node) {
		numlist.add(node);
		if(minlist.isEmpty()||node<minlist.get(minlist.size()-1)) {
			minlist.add(node);
		}else {
			minlist.add(minlist.get(minlist.size()-1));
		}
	}

	public void pop() {
		numlist.remove(numlist.size()-1);
		minlist.remove(minlist.size()-1);
	}

	public int top() {
		return numlist.get(numlist.size()-1);
	}

	public int min() {
		return minlist.get(minlist.size()-1);
	}
}
