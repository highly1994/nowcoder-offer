package com.nowcoder.problem1;


/**
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author CDF
 *
 */
public class Solution {

	public boolean Find(int target, int[][] array) {
		int i=array.length-1;
		int j=0;
		while(i>=0&&j<array[0].length){
			if(target==array[i][j])return true;
			else if(target<array[i][j])i--;
			else j++;
		}
		return false;
	}

}
