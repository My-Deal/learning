package data.structure.tree;

public interface BinarySearchTree {
    public BinarySearchTreeImpl addNode(int data);

    public void inorderTraversal();

    public void preOrderTraversal();

    public void postorderTraversal();

    public boolean search(int number);
}
