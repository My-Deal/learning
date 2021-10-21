package data.structure.linklist;

public class SingleNode<T> {
      T data;
     SingleNode next;
    public SingleNode(T data){
        this.data=data;
        this.next=null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SingleNode<T> getNext() {
        return next;
    }

    public void setNext(SingleNode<T> next) {
        this.next = next;
    }
}
