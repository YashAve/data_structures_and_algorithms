package javacode.datastructures.binary_search_trees;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}
