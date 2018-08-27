package com.nowcoder.problem65;
/**
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ� 
 * ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		char[] matrix= {'a','b','c','e','s','f','c','s','a','d','e','e'};
//		char[] str= {'b','c','c','e','d'};
		char[] str= {'a','b','c','b'};
		System.out.println(new Solution().hasPath(matrix, 3, 4, str));
	}
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		if(matrix==null||matrix.length!=rows*cols)return false;
		int[][] temp=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(helper(matrix,temp,i,j,str,0))return true;
			}
		}
		return false;
    }
	
	public boolean helper(char[] matrix,int[][] temp,int i,int j,char[] str,int index) {
		if(temp[i][j]==1)return false;
		if(matrix[i*temp[0].length+j]!=str[index])return false;
		if(index==str.length-1)return true;
		temp[i][j]=1;
		if(i>0&&helper(matrix,temp,i-1,j,str,index+1))return true;
		if(j<temp[0].length-1&&helper(matrix,temp,i,j+1,str,index+1))return true;
		if(i<temp.length-1&&helper(matrix,temp,i+1,j,str,index+1))return true;
		if(j>0&&helper(matrix,temp,i,j-1,str,index+1))return true;
		temp[i][j]=0;
		return false;
	}
}
