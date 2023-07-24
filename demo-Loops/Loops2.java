import java.util.ArrayList;
import java.util.Arrays;

public class Loops2 {
  
  public static void main(String[] args){


    //basic for-loop
    for(int i =0; i<3; i++){
      System.out.println("Basic for-loop Hello");
       }
      //counter --> this is used as a counter by default
      //it may contain bugs as in looping the data set
      //advantage: can control looping via i +=2, good for controlling range of looping
      //
   

    //for-each
    int[] arr = new int[] {1,2,3,4};
    // for (each variable : dataset)
    // priority for looping through array --> since it loops through all elements by default
    // can not extract additional information for data comparsion such arr[0] + arr[1] + arr[arr.length-1]
    for (int x : arr){
      System.out.println("For-Each Hello" + x); //x = array value NOT INDEX! 
      //System.out.println(arr[x-1]);
      System.out.println(arr[0]);
      arr[0] = 100; // can modify element during the loop

    }

    //practice for-each
    String [] string11 = new String[] {"Hello","World"};
    for(String x : string11){
      System.out.print(x + " ");
    }


    // Integer, Character (Wrapper Class)
    Character[] charrs = new Character[] {'I', 'L', 'O','V','E'};
    for(char charr : charrs){
      System.out.println(charr);
    }


    // //split method
      String s2 = "Hello world. I am Mark";
    //  String[] Stringss = s2.split(" ");
    //  for(String s : Stringss){
    //   System.out.println(s);
    //  }

    //without split, for loop split s2
    //using toCharrArray()
    // char[] named = new char[s2.length()];
    // for(int i=0;i< s2.length(); i++){
    //   named[i] = s2.charAt(i);
    // }
    // for(char x: named){
    //   System.out.println(x);
    // }
    
    char[] charArray = s2.toCharArray();
    String currentWord = "";

    for (int i = 0; i < charArray.length; i++) {
        if (charArray[i] == ' ') { //if there is space 
            if (!currentWord.equals("")) { //if word not empty
                System.out.println(currentWord); //print
                currentWord = "";  //reset to empty
            }
        } else {
            currentWord += charArray[i];
            if (i == charArray.length - 1) { //print last word
                System.out.println(currentWord);
            }
        }
    }
    
   
  
      
      


    //using substring()
    //substring.()

    int spaceCount = 0;
    for(int i =0; i<s2.length(); i++){
      if(s2.charAt(i) == ' '){
        spaceCount ++;
      }
    }
    int startIdx =0;
    int idx = 0;
    String[] result = new String[spaceCount + 1];
    for(int i=0; i<s2.length();i++){
      if(s2.charAt(i)==' '){
        result[idx] = s2.substring(startIdx, i);
        idx++;
        startIdx = i + 1;
      } else if(i == s2.length() -1){
        result[idx] = s2.substring(startIdx, s2.length());
      }

    }
    System.out.println(Arrays.toString(result));
  }
  }
