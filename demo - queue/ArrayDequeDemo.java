import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeDemo {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("ghi");
    System.out.println(strings.poll());
    System.out.println(strings.size());
    strings.addLast("");
    System.out.println(strings.poll());
    strings.addFirst("ijk");
    System.out.println(strings.peek());

    Deque<String> deque = new LinkedList<>();  //use weaker one on the left, while right side is the powerful one. 
    Queue<String> queue = new LinkedList<>();  // concept of using interface, since Linkedlist is the strongest.

    queue.add("abc");
    deque.add("bcdf");

    run1(new LinkedList());
    run1(new ArrayDeque<>());
    

    run2(new LinkedList<>());
    run2(new ArrayDeque<>());
    run2(new PriorityQueue<>());

  }
    public static void run1(Deque<String> deque){
      deque.addFirst("ss");
      deque.addLast("qq");
    }

    public static void run2(Queue<String> queue){
      queue.add("ss");
  }



  
}
