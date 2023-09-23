import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Testing19 {
  public static void main(String[] args) {
    String key = "the quick brown fox jumps over the lazy dog";
    String message = "vkbs bs t suepuv";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    LinkedHashSet<Character> keyOnly = new LinkedHashSet<>();

    for(int k=0; k<key.length();k++){
      char kk = key.charAt(k);
      if(kk != ' ')
        keyOnly.add(kk);
    }
    List<Character> list = new ArrayList<>(keyOnly);
     System.out.println(list);

    HashMap<Character,Character> decode = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<alphabet.length();i++){
          decode.put(list.get(i), alphabet.charAt(i));
        }
        System.out.println(decode);
        for(int j=0; j<message.length();j++){
          char c = message.charAt(j);
          if(c != ' '){
            sb.append(decode.get(c));
          }else
            sb.append(' ');
        }
        System.out.println(sb.toString());
  }
}
