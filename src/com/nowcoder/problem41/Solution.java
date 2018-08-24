package com.nowcoder.problem41;

import java.util.ArrayList;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().FindContinuousSequence(100));
	}
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		int left=1,right=2;
		while(left<right) {
			int temp=(left+right)*(right-left+1)/2;
			if(temp==sum) {
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=left;i<=right;i++) {
					list.add(i);
				}
				res.add(list);
				left++;
			}else if(temp<sum) {
				right++;
			}else {
				left++;
			}
		}
		return res;
    }

}
