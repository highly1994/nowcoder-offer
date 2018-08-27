package com.nowcoder.problem64;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� 
 * �������{2,3,4,2,6,2,5,1}�Ļ�������������6���� {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(num==null||num.length<size||size==0)return res;
        LinkedList<Integer> index=new LinkedList<Integer>();
        for(int i=0;i<size-1;i++) {
        	while(!index.isEmpty()&&num[i]>num[index.getLast()]) {
        		index.removeLast();
        	}
        	index.add(i);
        }
        for(int i=size-1;i<num.length;i++) {
        	while(!index.isEmpty()&&num[i]>num[index.getLast()]) {
        		index.removeLast();
        	}
        	index.add(i);
        	while(i-index.getFirst()+1>size)index.removeFirst();
        	res.add(num[index.getFirst()]);
        }
        return res;
    }

}
