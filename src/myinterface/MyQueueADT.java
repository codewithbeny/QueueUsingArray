package myinterface;

public interface MyQueueADT<E> {
    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
}
