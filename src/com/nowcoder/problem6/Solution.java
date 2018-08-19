package com.nowcoder.problem6;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * 
 * @author CDF
 *
 */
public class Solution {
	public int minNumberInRotateArray(int[] array) {
		if(array.length==0)return 0;
		if(array.length==1)return array[0];
		return helper(array,0,array.length-1);
	}
	
	private int helper(int[] array,int left,int right){
		if(left==right)return array[left];
		int mid=(left+right)/2;
		if(array[mid]<array[right]){
			right=mid;
			return helper(array,left,right);
		}else if(array[mid]>array[left]){
			left=mid+1;
			return helper(array,left,right);
		}else{
			left++;
			return helper(array,left,right);
		}
	}
}
