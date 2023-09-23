import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {
  public static void main(String[] args) {

    //first in first out
    LinkedList<String> queue = new LinkedList<>();

    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek()); //hello
    System.out.println(queue.poll()); //hello //empty element inside
    System.out.println(queue.poll()); //world

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); //true
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //xyz

    System.out.println(queue.offer("ijk"));
    System.out.println(queue.offer("ijk"));
    System.out.println(queue.size()); //2

    while(!queue.isEmpty()){
      System.out.println(queue.poll());//count + empty
    }
    System.out.println(queue.size());//0


    LinkedList<String> backup = queue;  //pointing at the same object reference
    while(!queue.isEmpty()){ 
      System.out.println(queue.poll());}  
    System.out.println(backup.size()); // 0

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.push(10);
    queueNum.push(9);
    queueNum.push(0);
    queueNum.push(-3);
    queueNum.push(100);

    int count = 0;
    int element = 0;
    int first = queueNum.peek();
    while(!queueNum.peek().equals(first)){
      element = queueNum.poll();
      if(element%2 ==0)
        count++;
      if(count >=2)
        continue;
      queueNum.add(element);

    }



  }
}
