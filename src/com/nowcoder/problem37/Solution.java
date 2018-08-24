package com.nowcoder.problem37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] numbers= {3,32,399};
		System.out.println(new Solution().PrintMinNumber(numbers));
	}
	
	public String PrintMinNumber(int [] numbers) {
		ArrayList<String> list=new ArrayList<String>();
		for(int num:numbers) {
			list.add(String.valueOf(num));
		}
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1=o1+o2;
				String s2=o2+o1;
				return s1.compareTo(s2);
			}
		});
		StringBuilder res=new StringBuilder();
		for(String str:list) {
			res.append(str);
		}
		return res.toString();
    }
	

}
