package com.nowcoder.problem32;
/**
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * @author tofuchen
 *
 */
public class Solution {
	
	public int GetUglyNumber_Solution(int index) {
		if(index==0)return 0;
        int[] nums=new int[index];
        nums[0]=1;
        int p2=0,p3=0,p5=0;
        for(int i=1;i<index;i++) {
        	int min=Math.min(2*nums[p2],3*nums[p3]);
        	min=Math.min(min, 5*nums[p5]);
        	nums[i]=min;
        	if(min==2*nums[p2])p2++;
        	if(min==3*nums[p3])p3++;
        	if(min==5*nums[p5])p5++;
        }
        return nums[index-1];
    }

}
