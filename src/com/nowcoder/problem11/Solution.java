package com.nowcoder.problem11;
/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * @author CDF
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().NumberOf1(-2));
	}
	
	public int NumberOf1(int n) {
		int res=0;
		while(n!=0){
			if((n&1)!=0)res++;
			n=n>>>1;
		}
		return res;
    }
}
