import java.util.LinkedList;
import java.util.Queue;

public class Student_eat_sandwitch {
  public static void main(String[] args) {
    
  
 int[] students = new int[] {1,1,1,0,0,1};
 int[] sandwiches = new int[] {1,0,0,0,1,1};

 Queue<Integer> stud = new LinkedList<>();
 for(int i: students){
  stud.add(i);
 }
 Queue<Integer> sand = new LinkedList<>();
 for(int j:sandwiches){
  sand.add(j);
 }
int count = 0;
while(!stud.isEmpty()){
  if(count>stud.size())
    break;

  else if(stud.peek()==sand.peek()){
    stud.remove();
    sand.remove();
    count = 0;
  }else{
    stud.add(stud.remove());
    count++;
  }


}
System.out.println(stud.size());
}
}