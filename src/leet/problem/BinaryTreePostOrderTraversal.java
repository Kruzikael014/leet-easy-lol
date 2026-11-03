package leet.problem;

import java.util.ArrayList;
import java.util.List;

import leet.problem.definitions.TreeNode;

public class BinaryTreePostOrderTraversal {

	public void rec(TreeNode root, List<Integer> listToAdd) {
		if (root == null) {
			return;
		}
		rec(root.left, listToAdd);
		rec(root.right, listToAdd);
		listToAdd.add(root.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		rec(root, list);
		System.out.println(list.toString());
		return list;
	}
}
