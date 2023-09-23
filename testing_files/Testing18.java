public class Testing18 {
  public static void main(String[] args) {
      int n = 3;
      int time= 5;

      Stack<Integer> stack = new Stack<>();
        int k =1;
        while(time>=0){
            if(k < n){
                stack.push(k);
                k++;
            }else{
                stack.pop();
            }
            time --;
        }
        return stack.peek();
 
  }
}
