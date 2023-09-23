import java.util.LinkedList;

public class ReversedLinkedList {

  int val;
  ReversedLinkedList next;
  ReversedLinkedList() {
    
  }
  ReversedLinkedList(int val) {
    this.val = val;
  }
   ReversedLinkedList(int val, ReversedLinkedList next) {
    this.val = val; 
    this.next = next;
  }

public ReversedLinkedList reverselist(ReversedLinkedList head){

  if (head == null) {
    return null;
}
  ReversedLinkedList current = head;
  ReversedLinkedList prev = null; 
  ReversedLinkedList next = null; 

  while(current!=null){
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }
  return prev ;
}



  public static void main(String[] args) {
    ReversedLinkedList head = new ReversedLinkedList(1);
    head.next = new ReversedLinkedList(2);
    head.next.next = new ReversedLinkedList(3);
    head.next.next.next = new ReversedLinkedList(4);
    head.next.next.next.next = new ReversedLinkedList(5);


    ReversedLinkedList reversedLinkedList = new ReversedLinkedList();

    ReversedLinkedList reversedHead = reversedLinkedList.reverselist(head);

    ReversedLinkedList current = reversedHead;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;

  }
}
}