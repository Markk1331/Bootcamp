import java.util.LinkedList;
import java.util.Queue;

public class  FindWinnerCircularGame {
  public static void main(String[] args) {
    Queue<Integer> queue =  new LinkedList<>();
    int n = 5;
    int k = 2;
    for(int i=1; i<n+1; i++){
      queue.add(i); 
    } 
    while(queue.size()!=1){
       for(int j=0; j<k-1;j++){
        queue.add(queue.poll());
       }
          queue.poll(); 
       
    } 

  System.out.println(queue.poll());
    
  }
}
