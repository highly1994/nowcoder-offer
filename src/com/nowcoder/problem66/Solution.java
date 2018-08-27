package com.nowcoder.problem66;
/**
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public int movingCount(int threshold, int rows, int cols){
        int[][] temp=new int[rows][cols];
        return helper(0,0,temp,threshold);
    }
	
	private int helper(int i,int j,int[][] temp,int threshold) {
		if(i<0||j<0||i>=temp.length||j>=temp[0].length||temp[i][j]==1||sum(i,j)>threshold)return 0;
		temp[i][j]=1;
		return helper(i-1,j,temp,threshold)+helper(i+1,j,temp,threshold)
		+helper(i,j-1,temp,threshold)+helper(i,j+1,temp,threshold)+1;
	}
	
	private int sum(int num1,int num2) {
		int res=0;
		while(num1>0) {
			res+=num1%10;
			num1=num1/10;
		}
		while(num2>0) {
			res+=num2%10;
			num2=num2/10;
		}
		return res;
	}
}
