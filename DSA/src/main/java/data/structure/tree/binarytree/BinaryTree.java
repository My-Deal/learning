package data.structure.tree.binarytree;

import data.structure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private TreeNode<Integer> root;

    public BinaryTree(int key){

        root=new TreeNode<>(key);
    }

    public BinaryTree(){
        root=null;
    }

    public BinaryTree addNode(int data){
        if(root==null){

            root=new TreeNode<>(data);
            return this;
        }
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> temp=queue.peek();
            queue.remove();
            if(temp.getLeft()==null){
                temp.setLeft(new TreeNode<Integer>(data));
                return this;
            }
            else{
                queue.add(temp.getLeft());
            }
            if(temp.getRight()==null){
                temp.setRight(new TreeNode<Integer>(data));
                return this;
            }else{
                queue.add(temp.getRight());
            }
        }
        return this;
    }

    public void levelOrder(TreeNode<Integer> root){
        Queue<TreeNode<Integer>>  queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode<Integer> temp=queue.peek();
            queue.remove();
            System.out.println("TreeNode<Integer> data is :"+temp.getData());
            if(temp.getLeft()!=null){
                queue.add(temp.getLeft());
                System.out.println(temp.getData()+"parent->>>>left child"+temp.getLeft().getData());
            }
            if(temp.getRight()!=null){
                queue.add(temp.getRight());
                System.out.println(temp.getData()+"parent->>>>right child"+temp.getRight().getData());
            }

        }
    }

    public TreeNode<Integer> getRoot(){
        return this.root;
    }



}
