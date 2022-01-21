package data.structure.tree.bst;

import data.structure.tree.TreeNode;

public class BinarySearchTreeImpl implements BinarySearchTree {
    private TreeNode<Integer> root;
    public BinarySearchTreeImpl(){
        this.root=null;
    }

    @Override
    public BinarySearchTreeImpl addNode(int data){
        root=insertRecursive(root,data);
        return this;
    }

    private TreeNode<Integer> insertRecursive(TreeNode<Integer> root, int data){
        if(root==null){
            root=new TreeNode<Integer>(data);
            return root;
        }else{
            if(data< root.getData()){
                root.setLeft(insertRecursive(root.getLeft(),data));
            }
            else{
               root.setRight(insertRecursive(root.getRight(),data));
            }
            return root;
        }
    }

    public void inorderTraversal(){
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        inorderTraversalRecursive(root.getLeft());
        System.out.println(root.getData());
        inorderTraversalRecursive(root.getRight());
    }

    public void preOrderTraversal(){
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        System.out.println(root.getData());
        preOrderTraversalRecursive(root.getLeft());

        preOrderTraversalRecursive(root.getRight());
    }


    public void postorderTraversal(){
        postorderTraversalRecursive(root);
    }

    private void postorderTraversalRecursive(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        postorderTraversalRecursive(root.getLeft());

        postorderTraversalRecursive(root.getRight());

        System.out.println(root.getData());
    }

    @Override
    public boolean search(int number) {
        boolean status= searchRecursive(root,number,0);
        if (!status){
            System.out.println("Number could not be found in tree !!!!!!!!!");
        }
        return status;
    }

    private boolean searchRecursive(TreeNode<Integer> root,int number,int level){
        if (root==null){
            return false;
        }
        if(number==root.getData()){
            System.out.println(" Number "+number+" found at level:"+level);
            return true;
        }else{
            if(number<root.getData()){
               return searchRecursive(root.getLeft(),number,++level);
            }else
            {
               return searchRecursive(root.getRight(),number,++level);
            }
        }

    }
    public TreeNode<Integer> getRoot() {
        return root;
    }

    public void delete(int key){
        root=deleteRecursive(root,key);
    }

    TreeNode<Integer> deleteRecursive(TreeNode<Integer> root, int key){
        if(root==null){
            return root;
        }
        if(key<root.getData()){
            root.setLeft(deleteRecursive(root.getLeft(),key));
        }
        else{
            if (key>root.getData()){
                root.setRight(deleteRecursive(root.getRight(),key));
            }
            else{
                if (root.getLeft()==null){
                    return root.getRight();
                }else{
                    if (root.getRight()==null){
                        return root.getLeft();
                    }
                    else {
                        root.setData(minValue(root.getRight()));
                        root.setRight(deleteRecursive(root.getRight(),root.getData()));
                    }
                }
            }
        }
        return root;
    }
    int minValue(TreeNode<Integer> root){
        int minv=root.getData();
        while (root.getLeft()!=null){
            minv=root.getLeft().getData();
            root=root.getLeft();
        }
        return minv;
    }
}
