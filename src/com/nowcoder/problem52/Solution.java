package com.nowcoder.problem52;

/**
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�� ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().match("aa".toCharArray(), "a*".toCharArray()));
	}
	
	public boolean match(char[] str, char[] pattern) {
		return helper(str,0,pattern,0);
	}
	
	private boolean helper(char[] str,int strIndex,char[] pattern,int patternIndex) {
		if(strIndex==str.length&&patternIndex==pattern.length) {
			return true;
		}
		if(strIndex<str.length&&patternIndex==pattern.length) {
			return false;
		}
		if(strIndex==str.length&&patternIndex<pattern.length) {
			if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*') {
				return helper(str,strIndex,pattern,patternIndex+2);
			}
			return false;
		}
		if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*') {
			if(pattern[patternIndex]==str[strIndex]||pattern[patternIndex]=='.')
				return helper(str,strIndex,pattern,patternIndex+2)
						||helper(str,strIndex+1,pattern,patternIndex+2)
						||helper(str,strIndex+1,pattern,patternIndex);
			else
				return helper(str,strIndex,pattern,patternIndex+2);
		}
		if(pattern[patternIndex]==str[strIndex]||pattern[patternIndex]=='.') {
			return helper(str,strIndex+1,pattern,patternIndex+1);
		}
		
		return false;
	}

}
