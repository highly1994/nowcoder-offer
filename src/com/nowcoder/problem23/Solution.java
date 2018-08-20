package com.nowcoder.problem23;
/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] s= {1,2,4,5,3};
		System.out.println(new Solution().VerifySquenceOfBST(s));
	}
	
	public boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence==null||sequence.length<=2)return true;
        return helper(sequence,0,sequence.length-1);
    }
	
	public boolean helper(int[] sequence,int left,int right) {
		if(left>=right)return true;
		int index=right-1;
		while(index>=left&&sequence[index]>sequence[right])index--;
		for(int i=left;i<=index;i++) {
			if(sequence[i]>sequence[right])return false;
		}
		return helper(sequence,left,index)&&helper(sequence,index+1,right-1);
	}

}
