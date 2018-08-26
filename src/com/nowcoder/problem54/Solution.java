package com.nowcoder.problem54;

import java.util.HashMap;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		Solution s=new Solution();
		char[] chs="google".toCharArray();
		for(char ch:chs) {
			s.Insert(ch);
			System.out.println(s.FirstAppearingOnce());
		}
	}
	
	HashMap<Character,Integer> map=new HashMap<>();
	private int index=0;
	
	//Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)) {
        	map.put(ch, -1);
        }else {
        	map.put(ch, index);
        }
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int min=Integer.MAX_VALUE;
    	char res='#';
    	for(Character ch:map.keySet()) {
    		if(map.get(ch)>=0&&map.get(ch)<min) {
    			res=ch;
    			min=map.get(ch);
    		}
    	}
    	return res;
    }

}
