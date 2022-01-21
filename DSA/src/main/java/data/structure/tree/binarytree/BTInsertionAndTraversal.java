package data.structure.tree.binarytree;

public class BTInsertionAndTraversal {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.addNode(1)
                .addNode(2)
                .addNode(3)
                .addNode(4)
                .addNode(5)
                .addNode(6)
                .addNode(7)
                .addNode(8)
                .levelOrder(bt.getRoot());
    }
}
