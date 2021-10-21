package data.structure.linklist;

public class SearchInLinkedList {
    public static void main(String[] args) {
        SingleNode<Integer> head=new SingleNode<>(1);
        SingleNode<Integer> node=head;
        node.next=new SingleNode(2);
        node=node.next;
        node.next=new SingleNode(3);
        node=head;
        System.out.println(search(node,0));
        System.out.println(search(node,3));
        System.out.println(searchRecursive(node,2));
        System.out.println(searchRecursive(node,5));
    }


    public static boolean search(SingleNode<Integer> head,int x){
        SingleNode<Integer> node=head;
        boolean found=false;
        while(node!=null){
            if(node.data==x){
                found=true;
                break;
            }
            node=node.next;
        }
        return found;
    }

    public static boolean searchRecursive(SingleNode<Integer> head,int x){
        if(head==null){
            return false;
        }
        if(head.data==x){
            return true;
        }
        return searchRecursive(head.next,x);
    }
}
