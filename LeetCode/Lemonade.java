
import java.util.LinkedList;
import java.util.Queue;

public class Lemonade {
  public static void main(String[] args) {

    int[] bills = new int[] {5,5,5,10,5,5,10,20,20,20};
    Queue<Integer> pocket = new LinkedList<>();
    for(int bill: bills){
      if(bill == 5)
        pocket.offer(5);
      if(bill == 10){
        if(pocket.contains(5)){
          pocket.remove(5);
          pocket.offer(10);
        }else{
          System.out.println(false + "1");
        }
          
      }
      else if(bill == 20){
        if(pocket.contains(5) && pocket.contains(10)){
          pocket.remove(10);
          pocket.remove(5);
        }
      
        else if(pocket.contains(5) && pocket.size()>=3 ){
          pocket.remove(5);
          pocket.remove(5);
          pocket.remove(5);
        }else{
          System.out.println(false+ "3");
        }
      }
      }
    System.out.println(true);
    
  }
  
}
