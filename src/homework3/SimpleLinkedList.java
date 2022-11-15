package homework3;

import java.util.StringJoiner;

public class SimpleLinkedList<T> {

  private Node head;
  private Node tail;
  private int n = 0;

  public void add(T data) {
    Node node = new Node();
    node.data = data;
    if (head == null) {
      head = node;
    } else {
      tail.next = node;
    }
    tail = node;
    n++;
  }

  public void addFirst(T data) {
    Node node = new Node();
    node.data = data;
    node.next = head;
    head = node;
    if (tail == null) {
      tail = node;
    }
    n++;
  }

  public T get(int i) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    Node node = head;
    for (int j = 0; j < i; j++) {
      node = node.next;
    }
    return node.data;
  }

  public void set(int i, T data) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    Node node = head;
    for (int j = 0; j < i; j++) {
      node = node.next;
    }
    node.data = data;
  }

  public boolean contains(T data) {
    Node node = head;
    while (node != null) {
      if (node.data.equals(data)) {
        return true;
      }
      node = node.next;
    }
    return false;
  }

  public int size() {
    return n;
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public int remove(int i) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    Node node = head;
    if (i == 0) {
      head = head.next;
    } else {
      for (int j = 0; j < i - 1; j++) {
        node = node.next;
      }
      node.next = node.next.next;
    }
    n--;
    return i;
  }

  public T removeFirst() {
    if (head == null) {
      throw new IndexOutOfBoundsException();
    }
    T data = head.data;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    n--;
    return data;
  }

  public T removeLast() {
    if (tail == null) {
      throw new IndexOutOfBoundsException();
    }
    T data = tail.data;
    if (head == tail) {
      head = null;
      tail = null;
    } else {
      Node node = head;
      while (node.next != tail) {
        node = node.next;
      }
      node.next = null;
      tail = node;
    }
    n--;
    return data;
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(", ", "[", "]");
    Node node = head;
    while (node != null) {
      sj.add(node.data.toString());
      node = node.next;
    }
    return sj.toString();
  }

  class Node {

    T data;
    Node next;
  }
}
