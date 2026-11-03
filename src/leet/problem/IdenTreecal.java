package leet.problem;

import leet.problem.definitions.TreeNode;

public class IdenTreecal {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
		if ((p.left != null && q.left == null) || (p.left == null && q.left != null)
				|| (p.right != null && q.right == null) || (p.right == null && q.right != null)) {
			return false;
		}
		if (p.left != null && p.left.val == q.left.val) {
			return true;
		}
		if (p.right != null && p.right.val == q.right.val) {
			return true;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
