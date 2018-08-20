package com.nowcoder.problem21;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      Stack<Integer> stack=new Stack<>();
	      int index=0;
	      for(int i=0;i<pushA.length;i++) {
	    	  stack.push(pushA[i]);
	    	  while(!stack.isEmpty()&&stack.peek()==popA[index]) {
	    		  stack.pop();
	    		  index++;
	    	  }
	      }
	      if(stack.isEmpty()&&index==popA.length)return true;
	      return false;
    }

}
