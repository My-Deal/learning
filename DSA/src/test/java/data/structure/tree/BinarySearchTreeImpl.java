package data.structure.tree;

public class BinarySearchTreeImpl implements BinarySearchTree {
    private Node root;
    public BinarySearchTreeImpl(){
        this.root=null;
    }

    @Override
    public BinarySearchTreeImpl addNode(int data){
        root=insertRecursive(root,data);
        return this;
    }

    private Node insertRecursive(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }else{
            if(data< root.data){
                root.left=insertRecursive(root.left,data);
            }
            else{
               root.right=insertRecursive(root.right,data);
            }
            return root;
        }
    }

    public void inorderTraversal(){
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(Node root){
        if (root==null){
            return;
        }
        inorderTraversalRecursive(root.left);
        System.out.println(root.data);
        inorderTraversalRecursive(root.right);
    }

    public void preOrderTraversal(){
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        preOrderTraversalRecursive(root.left);

        preOrderTraversalRecursive(root.right);
    }


    public void postorderTraversal(){
        postorderTraversalRecursive(root);
    }

    private void postorderTraversalRecursive(Node root){
        if (root==null){
            return;
        }
        postorderTraversalRecursive(root.left);

        postorderTraversalRecursive(root.right);

        System.out.println(root.data);
    }

    @Override
    public boolean search(int number) {
        boolean status= searchRecursive(root,number,0);
        if (!status){
            System.out.println("Number could not be found in tree !!!!!!!!!");
        }
        return status;
    }

    private boolean searchRecursive(Node root,int number,int level){
        if (root==null){
            return false;
        }
        if(number==root.data){
            System.out.println(" Number "+number+" found at level:"+level);
            return true;
        }else{
            if(number<root.data){
               return searchRecursive(root.left,number,++level);
            }else
            {
               return searchRecursive(root.right,number,++level);
            }
        }

    }
    public Node getRoot() {
        return root;
    }
}
