import java.util.LinkedList;

public class BuyTicket {
  public static void main(String[] args) {
    int[] tickets = new int[] {2,3,2};
    int k = 1;
    int time = 0;
    int index = 0;
    LinkedList<Integer> Queue = new LinkedList<>();

    for(int i =0; i<tickets.length; i++){
      Queue.add(i);
    }
    while(!Queue.isEmpty()){
      index = Queue.poll();
      time ++;
      tickets[index] --; 

      if(tickets[k] == 0){
        System.out.println(time);
        break;
      }
      if(tickets[index]>0)
        Queue.add(index);

    }
    
  }
}
