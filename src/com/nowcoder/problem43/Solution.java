package com.nowcoder.problem43;

/**
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public String LeftRotateString(String str, int n) {
		if(n==0||str==null||str.length()<=1)return str;
		n=n%str.length();
		StringBuilder res=new StringBuilder();
		for(int i=n;i<str.length();i++) {
			res.append(str.charAt(i));
		}
		for(int i=0;i<n;i++) {
			res.append(str.charAt(i));
		}
		return res.toString();
	}

}
