package LinkedList;

public class Node {
  Node next; //pass by reference
  int data;

  public Node(int data){
    this.data = data;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(5);
  }
}
