public class Maximum_consecutive {
  public static void main(String[] args) {
    int[] numbers = new int[] {0,0,0,0,1,1,1};
    int count = 1;
    int index = 0;
    int max = 1;
    for(int i =1; i<=numbers.length-1;i++){
      //System.out.println("index of" + i);
      //System.out.println("  value is"+ numbers[i]);
      if(numbers[i]==numbers[i-1]){
        count += 1;
        System.out.println(count);
         
      }else{
        count = 1;
       
      }
      
      max = Math.max(count,max);
      
      
    }
    System.out.println("last count is "+ count);
    System.out.println("max count is" + max);
  }
}
