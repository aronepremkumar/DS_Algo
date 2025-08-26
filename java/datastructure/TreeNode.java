package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }

    //traverse the treenode and print them
    /*public void printTree(TreeNode root){
        //print the tree in the breadth first manner
        if(root == null){
            return;
        }

        if(root.left != null){
            System.out.println(root.left.val);
        }
        if(root.right != null){
            System.out.println(root.right.val);
        }
        printTree(root.left);
        printTree(root.right);

//        System.out.println(root.val);
//        printTree(root.left);
//        printTree(root.right);
    }*/

    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
