package homework4;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {

  private E[] queue;
  private int size = 0;
  private int front = 0;
  private int back = 0;

  @Override
  public void enqueue(E element) {
    if (size == queue.length) {
      @SuppressWarnings("unchecked")
      E[] temp = (E[]) new Object[queue.length * 2];
      System.arraycopy(queue, 0, temp, 0, queue.length);
      queue = temp;
    }
    queue[back++] = element;
    back %= queue.length;
    size++;
  }

  @Override
  public E dequeue() {
    if (size == 0) {
      return null;
    }
    E element = queue[front++];
    front %= queue.length;
    size--;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E front() {
    if (size == 0) {
      return null;
    }
    return queue[front];
  }

  @Override
  public Iterator<E> iterator() {
    return new QueueIterator();
  }

  class QueueIterator implements Iterator<E> {

    private int index = front;
    private int count = 1;

    @Override
    public boolean hasNext() {
      return count < size;
    }

    @Override
    public E next() {
      E element = queue[index++];
      index %= queue.length;
      count++;
      return element;
    }
  }
}
