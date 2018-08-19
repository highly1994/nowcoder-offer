package com.nowcoder.problem10;
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author CDF
 *
 */
public class Solution {
	public int RectCover(int target) {
        if(target==0)return 0;
        if(target==1)return 1;
		if(target==2)return 2;
		int a=1;
		int b=2;
		for(int i=3;i<=target;i++){
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;
    }
}
