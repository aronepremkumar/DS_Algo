package datastructure;

import java.util.Stack;

public class TreeReversalBFSIteration {

    public static TreeNode reverseTree(TreeNode treeNode){
        if(treeNode == null)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(treeNode);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null)
                stack.push(current.left);
            if(current.right != null)
                stack.push(current.right);
        }


        return treeNode;
    }


    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("Original Tree:");
        root.printTree(root);
        root = reverseTree(root);
        System.out.println("Reversed Tree:");
        root.printTree(root);
    }
}
