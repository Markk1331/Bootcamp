import java.util.Arrays;

public class BuyTickets2 {
  public static void main(String[] args) {
    int[] tickets = new int[] {84,49,5,24,70,77,87,8};
    int k = 3;
    int time = 0;

    int[] queue = Arrays.copyOf(tickets,tickets.length);

    while(queue[k]>0){
      for(int i=0;i<queue.length;i++){
        queue[i]--;
        time ++;

        if(queue[i]<0)
          time --;
          
        if (queue[k] == 0) 
          break;
      }
      
    }
    System.out.println(time);
  }
}
