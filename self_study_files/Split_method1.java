package self_study_files;

public class Split_method1 {

  public static void main(String[] args){
  String str = "I am Mark. Hello World.";

  char [] characters = str.toCharArray();
  String answer = " ";
    //System.out.println(characters);
  for(char c: characters){
    //System.out.println(c);
    if(c == ' ' || c == characters[characters.length - 1]){ //if c is space or c is the last character
        System.out.println(answer);
        answer = " ";  //rest the concattnated string
    
    }
    
    else{
      answer += String.valueOf(c);


    }
  }
  }
}
