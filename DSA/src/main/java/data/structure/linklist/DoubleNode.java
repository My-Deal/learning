package data.structure.linklist;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> prev,next;

    public DoubleNode(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    public T getData() {
        return data;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }
}
