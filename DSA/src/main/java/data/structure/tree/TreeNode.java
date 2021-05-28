package data.structure.tree;

public class TreeNode<T> {
    T data;
    TreeNode left,right;
    public TreeNode(T data){
        this.data=data;
        left=right=null;
    }
}
