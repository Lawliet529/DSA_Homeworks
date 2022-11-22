package homework4;

import java.util.Iterator;

public class LinkedListQueue<E> implements QueueInterface<E> {

  private Node queue = null;

  @Override
  public void enqueue(E element) {
    Node node = new Node();
    node.element = element;
    node.next = queue;
    queue = node;
  }

  @Override
  public E dequeue() {
    E element = queue.element;
    queue = queue.next;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return queue == null;
  }

  @Override
  public E front() {
    return queue.element;
  }

  @Override
  public Iterator<E> iterator() {
    return new QueueIterator();
  }

  class QueueIterator implements Iterator<E> {

    private Node currentNode = queue;

    @Override
    public boolean hasNext() {
      return currentNode.next != null;
    }

    @Override
    public E next() {
      E element = currentNode.element;
      currentNode = currentNode.next;
      return element;
    }
  }

  class Node {

    E element;
    Node next;
  }
}
