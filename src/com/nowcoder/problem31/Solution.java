package com.nowcoder.problem31;

/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 * ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().NumberOf1Between1AndN_Solution(13));
	}
	
	public int NumberOf1Between1AndN_Solution(int n) {
		int pre=0;
		int i=1;
		int after=0;
		int num=0;
		int res=0;
		while(n/i!=0) {
			pre=n/(i*10);
			after=n-(n/i)*i;
			num=(n/i)%10;
			if(num==0) {
				res=res+pre*i;
			}else if(num==1) {
				res=res+pre*i+after+1;
			}else {
				res=res+(pre+1)*i;
			}
			i*=10;
		}
		return res;
	}

}
