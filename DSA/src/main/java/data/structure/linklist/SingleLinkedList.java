package data.structure.linklist;

public class SingleLinkedList<T> {

    private SingleNode<T> head;

    public SingleLinkedList() {
        head=null;
    }

    public SingleNode<T> getHead() {
        return head;
    }

    public SingleLinkedList(T data) {
        head = new SingleNode<>(data);
    }

    public void addToHead(T data) {
        SingleNode<T> temp = new SingleNode<>(data);
        if (head == null) {
            head = temp;
        } else {
            temp.setNext(head);
            head = temp;
        }
    }

    public void addToTail(T data) {
        SingleNode<T> temp = head;
        if (head==null){
            head=new SingleNode<>(data);
        }else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new SingleNode(data));
        }
    }

    public T deleteFromHead() {
        SingleNode<T> temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp.getData();
    }

    public T deleteFromTail(){
        SingleNode<T> temp=head;
        while (temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
  T data=temp.getNext().getData();
         temp.setNext(null);
         return data;
    }

    public void printAll(){
        SingleNode<T> temp=head;
        System.out.println();
        while (temp!=null){
            System.out.print(temp.getData());
            System.out.print("->");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> list=new SingleLinkedList<>();
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(5);
        list.addToHead(0);
        list.printAll();
        list.deleteFromHead();
        list.printAll();
        list.deleteFromTail();
        list.printAll();
    }
}
