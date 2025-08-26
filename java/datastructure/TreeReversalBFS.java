package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TreeReversalBFS {

    /**
     *
     * @param root
     * @return
     */
    public static TreeNode reverseTree(TreeNode root) {
        //We have to use a queue to perform BFS
        //Queue process in the order of FIFO
        //Queue methods offer and poll will be used to insert and return elements from a tree
        if(root==null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode eachTreeNode = queue.poll();
            TreeNode temp = eachTreeNode.left;
            eachTreeNode.left = eachTreeNode.right;
            eachTreeNode.right = temp;

            if(eachTreeNode.left != null)
                queue.offer(eachTreeNode.left);
            if(eachTreeNode.right !=null)
                queue.offer(eachTreeNode.right);
        }
        return root;
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
