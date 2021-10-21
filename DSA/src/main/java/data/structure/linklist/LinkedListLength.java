package data.structure.linklist;

public class LinkedListLength {


    public static void main(String[] args) {
         SingleNode<Integer> head=new SingleNode<>(1);
         SingleNode<Integer> node=head;
        node.setNext(new SingleNode<>(2));
        node=node.getNext();
        node.setNext(new SingleNode<>(3));
        node=node.getNext();
        node.setNext(new SingleNode<>(4));
        node=node.getNext();
        node.setNext(new SingleNode<>(5));
        print(head);
        System.out.println("Count");

        System.out.println(countLinkedList(head));
        node=head;
        System.out.println("Recursive Count");
        System.out.println(recursiveCountLinkedList(node));


    }

    public static int countLinkedList(SingleNode<Integer> head){
            int count=0;
            if(head==null){
                return count;
            }
            SingleNode<Integer> node=head;
            while (node!=null){
                count++;
                node=node.next;
            }
            return count;
    }

    public static int recursiveCountLinkedList(SingleNode<Integer> head){
        if(head==null){
            return 0;
        }
        return 1+recursiveCountLinkedList(head.next);
    }

    public static void print(SingleNode<Integer> head){
        SingleNode<Integer> node=head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
