import java.util.Arrays;

public class FirstUnique {

  public static void main(String[] args) {
    String s = "leetcode";

         int [] letter = new int[26];
        int first = 100;
        for(int i=0; i<s.length();i++){
            int c = s.charAt(i) - 'a';       
                letter[c]++;
                   
        }

        System.out.println(Arrays.toString(letter));
        for(int j=0; j<letter.length;j++){
            if(letter[j] ==1){
              System.out.println((char)(j+'a'));
                first = Math.min(s.indexOf(Character.valueOf((char) (j+'a'))), first);
            }else{
              System.out.println(-1);
            
            }
        }

        System.out.println(first); 
    }
}
