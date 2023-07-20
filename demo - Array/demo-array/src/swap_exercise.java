import java.util.Arrays;
//hard one

public class swap_exercise {

public static void main(String[] args){
  String str = "abcd";
  System.out.println(SwapOddEvenCharacter(str));

  
 // String [] character_holder = new String[]{};
  //char [] character_holder = str.toCharArray();
  

}
  public static String SwapOddEvenCharacter(String str){

    //first and second characters swap
    //third and fourth swap
    //abcdef --> badcfe

    int Length = str.length();
    //steps

    // find the length of the string 
    // loop through a string
    char [] character_holder = str.toCharArray();
    char temp = 'a';


    for(int x=0; x< Length-1; x+=2){

      // alternative (using if) --> checking the final digit in the array
      // if(x== Length-1){   
      //    break;
      // }

      temp = character_holder[x];
      character_holder[x] = character_holder[x +1];
      character_holder[x +1] = temp;
    }
    return(Arrays.toString(character_holder));
  
    //return str = String.valueOf(123);
    //
  }
  
}
  
  

