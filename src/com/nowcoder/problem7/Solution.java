package com.nowcoder.problem7;
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����n<=39
 * @author CDF
 *
 */
public class Solution {
	
	public int Fibonacci(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++){
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;

    }
}
