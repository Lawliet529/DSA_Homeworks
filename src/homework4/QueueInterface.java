package homework4;

public interface QueueInterface<E> extends Iterable<E> {

  void enqueue(E element);

  E dequeue();

  boolean isEmpty();

  E front();
}
