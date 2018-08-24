package com.nowcoder.problem42;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * @author tofuchen
 *
 */
public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        res.add(0);
		int min=Integer.MAX_VALUE;
		int left=0,right=array.length-1;
		while(left<right) {
			int temp=array[left]+array[right];
			if(temp==sum) {
				if(array[left]*array[right]<min) {
					min=array[left]*array[right];
					res.set(0, array[left]);
					res.set(1, array[right]);
				}
				left++;
				right--;
			}else if(temp<sum){
				left++;
			}else {
				right--;
			}
		}
		if(min==Integer.MAX_VALUE) {
			res.remove(res.size()-1);
			res.remove(res.size()-1);
		}
		return res;
        
    }
}
