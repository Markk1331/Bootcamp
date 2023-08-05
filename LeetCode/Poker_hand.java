import java.util.Arrays;

public class Poker_hand {


   public static boolean isFlush(char[] suits){

    for(int i = 1; i<suits.length; i++){
      if(suits[i] == suits[i-1] ){
        return true;
      } 
    }
    return false;
   }


    // public static boolean isThreeOfAKind(int[] ranks){
    //   int count = 1;
    //   for(int q =1;q<ranks.length;q++){
    //     if(ranks[q-1] == ranks[q]){
    //       count += 1;
    //       System.out.println(count);
    //     }
    //   }
      
    //   if(count!=4){
    //        for(int i=0; i<ranks.length; i++){
    //     for(int j=1+i;j<ranks.length; j++){
    //       for(int k=j+1; k<ranks.length; k++){
    //         if(ranks[i]==ranks[j] && ranks[i] == ranks[k]){
    //           return true;
    //       }
    //       }
    //     }
    //   }
    //   }

   
    //   return false;
    // }

    //  public static boolean isPair(int[] ranks){

    //   if(!isThreeOfAKind(ranks)){

    //         for(int i=0; i<ranks.length; i++){
    //     for(int j=1+i;j<ranks.length; j++){
    //         if(ranks[i]==ranks[j]){
    //           return true;
    //       }
    //     }
    //   }
    //   }
    
    //   return false;
    // }

    public static boolean isThreeOfAKind(int[] ranks){
      int[] cards = new int[13];
      for(int i=0; i<ranks.length; i++){
        if(++cards[ranks[i]-1]>=3)   //the -1 means move the "No.1" card to index 0 at the [card] arraylist for counting
         return false;
      }
      return true;
    }

    public static boolean isPair(int[] ranks){
      int[] cards = new int[13];
      for(int i=0; i<ranks.length; i++){
        if(++cards[ranks[i]-1]>=2) //the -1 means move the "No.1" card to index 0 at the [card] arraylist for counting
        
         return false;
      }
      System.out.println(Arrays.toString(cards));
      return true;
    }



    //   public static boolean isHighCard(...){
    //     return false;
    //   }
  public static void main(String[] args) {
    
  
  int[] ranks = new int[] {13,2,2,2,2};
  char[] suits = new char[] {'a','a','a','a','a'};

    System.out.println(isFlush(suits));
    System.out.println(isThreeOfAKind(ranks));
    System.out.println(isPair(ranks));
  }
}
