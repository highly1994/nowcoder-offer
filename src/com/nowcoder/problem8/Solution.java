package com.nowcoder.problem8;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * @author CDF
 *
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target==0)return 1;
		if(target==1)return 1;
		int a=1;
		int b=1;
		for(int i=2;i<=target;i++){
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;
    }
}
