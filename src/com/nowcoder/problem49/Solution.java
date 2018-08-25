package com.nowcoder.problem49;

/**
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
 * ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
 * 
 * @author tofuchen
 *
 */
public class Solution {
	public int StrToInt(String str) {
		if(str==null||str.length()==0)return 0;
		if(str.length()==1&&!isNum(str.charAt(0)))return 0;
		boolean isZhen=true;
		int res=0;
		char ch=str.charAt(0);
		if(ch=='-')isZhen=false;
		else if(ch=='+')isZhen=true;
		else if(!isNum(ch))return 0;
		else res=ch-'0';
		for(int i=1;i<str.length();i++) {
			ch=str.charAt(i);
			if(!isNum(ch))return 0;
			res=res*10+ch-'0';
		}
		if(isZhen)return res;
		return -res;

	}
	
	private boolean isNum(char ch) {
		if(ch>'0'&&ch<='9')return true;
		else return false;
	}
}
