package com.nowcoder.problem27;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String str="abc";
		System.out.println(new Solution().Permutation(str));
	}
	
	public ArrayList<String> Permutation(String str) {
		char[] chars=str.toCharArray();
		Arrays.sort(chars);
		int[] key=new int[chars.length];
		ArrayList<Character> strs=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
		helper(chars,key,strs,res);
		return res;
    }
	
	private void helper(char[] chars,int[] key,ArrayList<Character> str,ArrayList<String> res) {
		for(int i=0;i<chars.length;i++) {
			if(key[i]==0) {
				if(i>0&&chars[i-1]==chars[i]&&key[i-1]==0) {
					continue;
				}else {
					if(str.size()==chars.length-1) {
						res.add(toString(str,chars[i]));
						break;
					}else {
						str.add(chars[i]);
						key[i]=1;
						helper(chars,key,str,res);
						key[i]=0;
						str.remove(str.size()-1);
					}
				}
			}
		}
	}
	
	private String toString(ArrayList<Character> str,char ch) {
		StringBuilder res=new StringBuilder();
		for(char c:str) {
			res.append(c);
		}
		res.append(ch);
		return res.toString();
	}

}
