package com.nowcoder.problem30;

/**
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 * 
 * @author tofuchen
 *
 */
public class Solution {
	public int FindGreatestSumOfSubArray(int[] array) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
}
