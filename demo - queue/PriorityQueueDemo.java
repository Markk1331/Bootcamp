import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> custom = new PriorityQueue<>(new SortByDescedning());
    custom.add("bcd");
    custom.add("abc");
    custom.add("123");
    System.out.println("custom " + custom.poll());

    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("123");
    System.out.println("normal "+ queue.poll());
  }
}
