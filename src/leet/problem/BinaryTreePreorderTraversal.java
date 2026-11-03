package leet.problem;

import java.util.ArrayList;
import java.util.List;

import leet.problem.definitions.TreeNode;

public class BinaryTreePreorderTraversal {

	public void rec(TreeNode root, List<Integer> listToAdd) {
		if (root == null) {
			return;
		}
		listToAdd.add(root.val);
		rec(root.left, listToAdd);
		rec(root.right, listToAdd);
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		rec(root, list);
		System.out.println(list.toString());
		return list;
	}

}
