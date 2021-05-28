package data.structure.linklist;

public class SingleNode<T> {
    private T data;
    private SingleNode next;
    public SingleNode(T data,SingleNode<T> next){
        this.data=data;
        this.next=next;
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
