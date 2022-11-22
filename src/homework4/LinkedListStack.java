package homework4;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {

  private Node stack = null;

  @Override
  public void push(E element) {
    Node node = new Node();
    node.element = element;
    node.next = stack;
    stack = node;
  }

  @Override
  public E pop() {
    E element = stack.element;
    stack = stack.next;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return stack == null;
  }

  @Override
  public E top() {
    return stack.element;
  }

  @Override
  public Iterator<E> iterator() {
    return new StackIterator();
  }

  class StackIterator implements Iterator<E> {

    private Node currentNode = stack;

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
