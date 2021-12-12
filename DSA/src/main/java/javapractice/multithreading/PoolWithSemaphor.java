package javapractice.multithreading;

import java.util.concurrent.Semaphore;

public class PoolWithSemaphor {
    private static final int MAX_AVAILABLE=2;
    private final Semaphore available=new Semaphore(MAX_AVAILABLE,true);

    public Object getItem() throws InterruptedException{
        available.acquire();
        return getNextAvailableItem();
    }

    public void putItem(Object x){
        if (markAsUnused(x)){
            available.release();
        }
    }

    protected Object[] items=new Object[MAX_AVAILABLE];
    protected  boolean[] used=new boolean[MAX_AVAILABLE];

    protected synchronized Object getNextAvailableItem(){
        for (int i=0;i<MAX_AVAILABLE;i++){
            if (!used[i]){
                used[i]=true;
                return items[i];
            }
        }
        return null;
    }

    protected synchronized boolean markAsUnused(Object item){
        for (int i=0;i<MAX_AVAILABLE;i++){
            if(item==items[i]){
                if(used[i]){
                    used[i]=false;
                    return true;
                }else
                {
                    return false;
                }
            }
        }
        return false;
    }
}
