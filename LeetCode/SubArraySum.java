public class SubArraySum {
  public static void main(String[] args) {
    int[] nums = new int[] {77,95,90,98,8,100,88,96,6,40,86,56,98,96,40,52,30,33,97,72,54,15,33,77,78,8,21,47,99,48};

    
     int half = (nums.length+1)/2;

    System.out.println("half" + half);
    int count =0 ;
    int countd = 0;


    if(nums.length %2 ==0){
    for(int i=0; i<half;i++){
        count += nums[i];
    }
  
    for(int j=half; j<nums.length; j++){
        countd += nums[j];
    }
  
  }
    else if(nums.length %2 !=0){
      for(int i=0; i<half;i++){
        count += nums[i];
    }
  
    for(int j=half-1; j<nums.length; j++){
        countd += nums[j];
    }
  
}
    System.out.println(count);
    System.out.println(countd);
    
  }
}
