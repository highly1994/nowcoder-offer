package com.nowcoder.problem63;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>();
	PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	});
	int count=0;
	
	
	public void Insert(Integer num) {
		if(count%2==0) {
			maxHeap.add(num);
			minHeap.add(maxHeap.poll());
		}else {
			minHeap.add(num);
			maxHeap.add(minHeap.poll());
		}
		count++;
	}

	public Double GetMedian() {
		if(count%2==0) {
			return new Double(minHeap.peek()+maxHeap.peek())/2;
		}else {
			return new Double(minHeap.peek());
		}
	}
}
