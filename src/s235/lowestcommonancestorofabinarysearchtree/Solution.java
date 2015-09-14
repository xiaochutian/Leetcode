/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s235.lowestcommonancestorofabinarysearchtree;

/**
 *
 * @author Xiaochutian
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = null;
        if (p.val == q.val) {
            result = p;
        } else if (p.val < q.val) {
            result = getLCA(root, p, q);
        } else {
            result = getLCA(root, q, p);
        }
        return result;
    }

    private TreeNode getLCA(TreeNode root, TreeNode left, TreeNode right) {
        //等于某个值，或者在两个值中间
        if (root.val == left.val || root.val == right.val || (root.val > left.val && root.val < right.val)) {
            return root;
        } else {
            //大于大值
            if (root.val > right.val) {
                return getLCA(root.left, left, right);
            } else {
                //root.val < left.val，小于小值
                return getLCA(root.right, left, right);
            }
        }
    }
}
