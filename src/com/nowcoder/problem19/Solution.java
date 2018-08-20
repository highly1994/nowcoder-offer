package com.nowcoder.problem19;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(new Solution().printMatrix(matrix).toString());
	}
	
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		int l=Math.min(matrix.length, matrix[0].length);
		int num=0;
		if(l%2==0)num=l/2;
		else num=l/2+1;
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int k=0;k<num;k++) {
			helper(res,matrix,k);
		}
		return res;
	}
	
	private void helper(ArrayList<Integer> res,int[][] matrix,int k) {
		if(k==matrix.length-1-k) {
			for(int j=k;j<matrix[0].length-k;j++) {
				res.add(matrix[k][j]);
			}
			return;
		}
		if(k==matrix[0].length-1-k) {
			for(int j=k;j<matrix.length-k;j++) {
				res.add(matrix[j][k]);
			}
			return;
		}
		
		//����
		for(int i=k;i<matrix[0].length-k;i++) {
			res.add(matrix[k][i]);
		}
		//����
		for(int i=k+1;i<matrix.length-k;i++) {
			res.add(matrix[i][matrix[0].length-1-k]);
		}
		//����
		for(int i=matrix[0].length-k-2;i>k-1;i--) {
			res.add(matrix[matrix.length-k-1][i]);
		}
		//����
		for(int i=matrix.length-2-k;i>k;i--) {
			res.add(matrix[i][k]);
		}
		return;
		
	}

}
