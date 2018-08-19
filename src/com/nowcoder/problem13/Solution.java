package com.nowcoder.problem13;

import java.util.Arrays;

/**
 * 
 *����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(array));
		new Solution().reOrderArray(array);
		System.out.println(Arrays.toString(array));
	}

	public void reOrderArray(int[] array) {
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(!isEven(array[i])) {
				insert(array,index,i);
				index++;
			}
		}
	}
	
	private void insert(int[] array,int i,int j) {
		int k=j;
		int temp=array[j];
		while(k>i) {
			array[k]=array[k-1];
			k--;
		}
		array[k]=temp;
	}
	
	private boolean isEven(int num) {
		if(num%2==0)return true;
		return false;
	}

}
