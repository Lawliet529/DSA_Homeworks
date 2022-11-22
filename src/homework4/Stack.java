package homework4;

import java.util.Iterator;

public class Stack<E> implements StackInterface<E> {

  int size = 0;
  private E[] stack;

  @SuppressWarnings("unchecked")
  public Stack() {
    stack = (E[]) new Object[10];
  }

  @SuppressWarnings("unchecked")
  public Stack(int size) {
    stack = (E[]) new Object[size];
  }

  @Override
  public void push(E element) {
    if (size == stack.length) {
      @SuppressWarnings("unchecked")
      E[] temp = (E[]) new Object[stack.length * 2];
      System.arraycopy(stack, 0, temp, 0, stack.length);
      stack = temp;
    }
    stack[size++] = element;
  }

  @Override
  public E pop() {
    if (size == 0) {
      return null;
    }
    E element = stack[--size];
    stack[size] = null;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E top() {
    if (size == 0) {
      return null;
    }
    return stack[size - 1];
  }

  @Override
  public Iterator<E> iterator() {
    return new StackIterator();
  }

  class StackIterator implements Iterator<E> {

    private int index = size - 1;

    @Override
    public boolean hasNext() {
      return index >= 0;
    }

    @Override
    public E next() {
      return stack[index--];
    }
  }
}
