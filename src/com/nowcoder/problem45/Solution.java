package com.nowcoder.problem45;

import java.util.Arrays;

/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ���� 
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 * @author tofuchen
 *
 */
public class Solution {
	public boolean isContinuous(int [] numbers) {
		if(numbers.length!=5)return false;
		Arrays.sort(numbers);
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0)count++;
			else break;
		}
		for(int i=count+1;i<numbers.length;i++) {
			if(numbers[i]==numbers[i-1]+1)continue;
			else if(numbers[i]==numbers[i-1]){
				return false;
			}else {
				count-=(numbers[i]-numbers[i-1]-1);
				if(count<0)return false;
			}
		}
		return true;

    }
}
