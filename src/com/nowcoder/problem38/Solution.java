package com.nowcoder.problem38;

import com.nowcoder.domain.TreeNode;

/**
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * @author tofuchen
 *
 */
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)return 0;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left, right)+1;
    }
}