import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stone_Jewels {
  public static void main(String[] args) {
    String jewels = "aAcB";
    String stones = "bbbbBaABBAAABBBa";
    int count = 0;
    int[] jewelry = new int[58];
    int sum = 0;

    for (char i = 0; i < jewels.length(); i++) {
      int s = jewels.charAt(i) - 'A';
      jewelry[s]++;
    }
    // for(int k=0; k<stones.length();k++){
    // int p = stones.charAt(k)- 'A';
    // if(jewelry[p]> 0){
    // sum++;

    // }

    // }
    // System.out.println(sum);
    List<Character> result = new ArrayList<>();

    for (int j = 0; j < stones.length(); j++) {
      char stone = stones.charAt(j);
      if (jewelry[stone - 'A'] > 0) {
        jewelry[stone - 'A']++;
      }
    }
    int charValue = 0;
    int answer = 0;
    for (int c = 0; c < jewelry.length; c++) {
      if (jewelry[c] == 3) {
        charValue = c;
        answer = charValue + 65;
        System.out.println((char) answer);
      }
    }
    // System.out.println(Arrays.toString(jewelry));
  }
}