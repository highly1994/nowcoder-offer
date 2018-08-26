package com.nowcoder.problem50;
/**
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
 * ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 * @author tofuchen
 *
 */
public class Solution {
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers==null||numbers.length==0) {
    		duplication[0]=-1;
    		return false;
    	}
    	int i=0;
    	while(i<numbers.length) {
    		if(numbers[i]==i)i++;
    		else {
    			if(numbers[numbers[i]]==numbers[i]) {
    				duplication[0]=numbers[i];
    				return true;
    			}else {
    				int temp=numbers[i];
    				numbers[i]=numbers[temp];
    				numbers[temp]=temp;
    			}
    		}
    	}
    	duplication[0]=-1;
    	return false;
    }
}
