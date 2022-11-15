package homework3;

public class SimpleLinkedListTest {

  public static void main(String[] args) {
    SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
    for (int i = 0; i < 10; i++) {
      list.add(Math.round((float) Math.random() * 10));
    }
    System.out.println(list);

    list.add(15);
    System.out.println(list);

    list.remove(0);
    System.out.println(list);

    list.set(0, 100);
    System.out.println(list);

    System.out.println(list.contains(15));
    System.out.println(list.contains(100));

    System.out.println(list.size());
    System.out.println(list.isEmpty());

    SimpleLinkedList<String> list2 = new SimpleLinkedList<>();
    for (int i = 0; i < 11; i++) {
      list2.add("Hello");
    }
    System.out.println(list2.size());
  }
}
