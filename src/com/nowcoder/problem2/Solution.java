package com.nowcoder.problem2;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author CDF
 *
 */

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().replaceSpace(new StringBuffer("we are family")));
	}

	public String replaceSpace(StringBuffer str) {
		String temp=str.toString();
		return temp.replaceAll(" ", "%20");
	}

}
