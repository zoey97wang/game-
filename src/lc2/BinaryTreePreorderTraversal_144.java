package lc2;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import lc2.TreeNode;

public class BinaryTreePreorderTraversal_144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> temp = new Stack<TreeNode>();
        if (root == null) {
            return result;
        }
        temp.push(root);
        while (!temp.empty()) {
            TreeNode r = temp.pop();
            result.add(r.val);
            if (r.right != null) {
                temp.push(r.right);
            }
            if (r.left != null) {
                temp.push(r.left);
            }
        }
        return result;
    }
}
