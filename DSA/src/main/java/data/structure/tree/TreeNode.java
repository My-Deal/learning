package data.structure.tree;

public class TreeNode<T> {
     private T data;
     private TreeNode left,right;
    public TreeNode(T data){
        this.data=data;
        left=right=null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<Integer> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<Integer> left) {
        this.left = left;
    }

    public TreeNode<Integer> getRight() {
        return right;
    }

    public void setRight(TreeNode<Integer> right) {
        this.right = right;
    }
}
