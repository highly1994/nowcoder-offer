package com.nowcoder.problem33;

import java.util.Arrays;

/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int FirstNotRepeatingChar(String str) {
		int[] temp=new int[52];
		Arrays.fill(temp, -1);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=0;
			if(ch>='a'&&ch<='z') {
				index=ch-'a';
			}else {
				index=ch-'A'+26;
			}
			if(temp[index]==-1) {
				temp[index]=i;
			}else if(temp[index]>=0) {
				temp[index]=-2;
			}
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<52;i++) {
			if(temp[i]>=0) {
				res=Math.min(res, temp[i]);
			}
		}
		if(res==Integer.MAX_VALUE)return -1;
		else return res;
	}

}
