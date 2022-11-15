package homework3;

public interface ListInterface<T> {

  void add(T data);

  T get(int i);

  void set(int i, T data);

  int remove(int i);

  boolean contains(T data);

  int size();

  boolean isEmpty();
}
