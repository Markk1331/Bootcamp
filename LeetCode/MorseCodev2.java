
import java.util.Arrays;
import java.util.HashSet;
public class MorseCodev2 {


  public static void main(String[] args) {
    String[] words = new String[]{"gin","zen","gig","msg"};


    HashSet<String> hs = new HashSet<>();
    char letter = 'a';
    String symbol = " ";

    for(String s: words){
     StringBuilder sb = new StringBuilder();
      for(int i=0; i<s.length();i++){
        letter = s.charAt(i);
  
      switch(letter){
        case 'a': 
        symbol = ".-";
        break;
        case 'b': 
        symbol = "-...";
        break;
        case 'c': 
        symbol = "-.-.";
        break;
        case 'd': 
        symbol = "-..";
        break;
        case 'e': 
        symbol = ".";
        break;
        case 'f': 
        symbol = "..-.";
        break;
        case 'g': 
        symbol = "--.";
        break;
        case 'h': 
        symbol = "....";
        break;
        case 'i': 
        symbol = ".." ;
        break;
        case 'j': 
        symbol = ".---";
        break;
        case 'k': 
        symbol = "-.-";
        break;
        case 'l': 
        symbol = ".-.." ;
        break;
        case 'm': 
        symbol = "--";
        break;
        case 'n': 
        symbol = "-.";
        break;
        case 'o': 
        symbol = "---";
        break;
        case 'p': 
        symbol = ".--.";
        break;
        case 'q': 
        symbol = "--.-";
        break;
        case 'r': 
        symbol = ".-.";
        break;
        case 's': 
        symbol = "...";
        break;
        case 't': 
        symbol = "-";
        break;
        case 'u': 
        symbol = "..-";
        break;
        case 'v': 
        symbol = "...-";
        break;
        case 'w': 
        symbol = ".--";
        break;
        case 'x': 
        symbol = "-..-";
        break;
        case 'y': 
        symbol = "-.--";
        break;
        case 'z': 
        symbol = "--..";
        break;
      }
      sb.append(symbol);

 }
  hs.add(sb.toString());
  System.out.println(hs);
  }
 // System.out.println(hs);
  System.out.println(hs.size());
  }
}




