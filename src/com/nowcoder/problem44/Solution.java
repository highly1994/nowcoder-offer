package com.nowcoder.problem44;

/**
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String str="student. a am I";
		System.out.println(new Solution().ReverseSentence(str));
	}

	public String ReverseSentence(String str) {
		char[] array=str.toCharArray();
		for(int left=0;left<array.length;) {
			while(left<array.length&&array[left]==' ')left++;
			if(left<array.length) {
				int right=findRight(array, left);
				helper(array,left,right);
				left=right+1;
			}
		}
		helper(array,0,array.length-1);
		return new String(array);
	}
	
	private int findRight(char[] array,int left) {
		int i=left;
		while(i<array.length&&array[i]!=' ') {
			i++;
		}
		return i-1;
	}
	
	private void helper(char[] array,int left,int right) {
		int i=left;
		int j=right;
		while(i<j) {
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
	}

}
