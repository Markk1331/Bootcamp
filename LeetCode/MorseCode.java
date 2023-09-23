import java.util.Arrays;
import java.util.HashSet;

public class MorseCode {
  public static void main(String[] args) {
    String[] words = new String[]{"gin","zen","gig","msg"};

    StringBuilder sb = new StringBuilder();
    StringBuffer sbf = new StringBuffer();
    HashSet<String> hs = new HashSet<>();
         
    char letter = 'a';
    String symbol = " ";
    int count = 0;

    
for(int i =0; i<words.length; i++){
    sbf.append(words[i]);
}
for(int j =0; j<sbf.toString().length();j++){
  letter = sbf.toString().charAt(j);
    //System.out.println(letter);

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

      hs.add(symbol);
      
       sb.append(symbol);
    }
    System.out.println("hs" + hs.toString());
    System.out.println("sb" + sb.toString());
    for(int j =0; j<hs.size();j++){
      count ++;
    }
     System.out.println(sb.toString());
     System.out.println(count);
  }
}


