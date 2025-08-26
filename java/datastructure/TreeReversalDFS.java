package datastructure;

public class TreeReversalDFS {

    public static TreeNode reverseTree(TreeNode treeNode){

        if(treeNode==null)
            return treeNode;

        //swap the node
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;

        reverseTree(treeNode.left);
        reverseTree(treeNode.right);

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
