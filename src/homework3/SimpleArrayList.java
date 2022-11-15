package homework3;

import java.util.StringJoiner;

public class SimpleArrayList<T> implements ListInterface<T> {

  private T[] array;
  private int n = 0;

  public SimpleArrayList() {
    array = (T[]) new Object[100];
  }

  public SimpleArrayList(int capacity) {
    array = (T[]) new Object[capacity];
  }

  @Override
  public void add(T data) {
    if (n == array.length) {
      T[] newArray = (T[]) new Object[array.length * 2];
      System.arraycopy(array, 0, newArray, 0, array.length);
      array = newArray;
    }
    array[n] = data;
    n++;
  }

  @Override
  public T get(int i) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    return array[i];
  }

  @Override
  public void set(int i, T data) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    array[i] = data;
  }

  @Override
  public int remove(int i) {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException();
    }
    for (int j = i; j < n - 1; j++) {
      array[j] = array[j + 1];
    }
    n--;
    return i;
  }

  @Override
  public boolean contains(T data) {
    for (int i = 0; i < n; i++) {
      if (array[i].equals(data)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return n;
  }

  @Override
  public boolean isEmpty() {
    return n == 0;
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(", ", "[", "]");
    for (int i = 0; i < n; i++) {
      sj.add(array[i].toString());
    }
    return sj.toString();
  }
}
