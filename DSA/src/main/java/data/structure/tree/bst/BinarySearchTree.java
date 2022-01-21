package data.structure.tree.bst;

public interface BinarySearchTree {
    public BinarySearchTreeImpl addNode(int data);

    public void inorderTraversal();

    public void preOrderTraversal();

    public void postorderTraversal();

    public boolean search(int number);

    public void delete(int key);
}
