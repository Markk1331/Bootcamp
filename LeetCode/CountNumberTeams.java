public class CountNumberTeams {
  public static void main(String[] args) {
    int[] rating = new int[] {};
    int len = rating.length;
    //low to high
    int count =0;

    for(int i=0; i<len; i++){
      for(int j=i+1; j<len; j++){
        for(int k=j+1; k<len; k++){
          if(rating[i]< rating[j] && rating[j] < rating[k])
         System.out.println(rating[i] + " " + rating[j] + " " + rating[k]);
            count +=1;
        }  
      }
    }
    for(int i=0; i<len; i++){
      for(int j=i+1; j<len; j++){
        for(int k=j+1; k<len; k++){
          if(rating[i]> rating[j] && rating[j] > rating[k])
          System.out.println(rating[i] + " " + rating[j] + " " + rating[k]);
            count +=1;
        }  
      }
    }
    System.out.println(count);
  }
}
