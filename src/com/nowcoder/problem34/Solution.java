package com.nowcoder.problem34;

/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,0};
		System.out.println(new Solution().InversePairs(array));
	}
	
	public int InversePairs(int[] array) {
		if(array==null||array.length<=1)return 0;
		int[] copy=new int[array.length];
		int res=helper(array,copy,0,array.length-1);
		return res%1000000007;
	}
	
	public int helper(int[] array,int[] copy,int left,int right) {
		if(left>=right)return 0;
		int mid=left+(right-left)/2;
		int leftcount=helper(array,copy,left,mid)%1000000007;
		int rightcount=helper(array,copy,mid+1,right)%1000000007;
		int i=mid,j=right;
		int count=0;
		int index=right;
		while(i>=left&&j>mid) {
			if(array[i]<array[j]) {
				copy[index--]=array[j--];
			}else {
				copy[index--]=array[i--];
				count+=(j-mid);
				count%=1000000007;
			}
		}
		while(i>=left) {
			copy[index--]=array[i--];
		}
		while(j>mid) {
			copy[index--]=array[j--];
		}
		for(int k=left;k<=right;k++) {
			array[k]=copy[k];
		}
		return count+leftcount+rightcount;
	}

}
