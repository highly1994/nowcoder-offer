package com.nowcoder.problem47;
/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
 * @author tofuchen
 *
 */
public class Solution {

	public int Sum_Solution(int n) {
		int sum=n;
		boolean res=(n>0)&&((sum+=Sum_Solution(n-1))>0);
		return sum;
	}

}
