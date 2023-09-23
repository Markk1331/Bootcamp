package LinkedList;

public class Nodelist {
  Node head;

  public Nodelist(Node head){
    this.head = head;
  }

  public void addLast(Node node){
    this.head.next = node; //fix bug
  }

  public void addFirst(Node node){

  }

  public void insert(int index, Node node){
    
  }

  public void remove(Node node){

  }

  public static void main(String[] args) {
    Nodelist list = new Nodelist( new Node(10));
    list.addLast(new Node(100));
    list.addLast(new Node(200));
  }
}
