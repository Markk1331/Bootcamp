import java.util.Arrays;

public class ID_Match {
    public static void main(String[] args) {
        
    
    String c = "DIIID"; 

    int down = 0;
    int Length= c.length();
    int up = Length;

    int[] answer = new int[Length+1];
    char[] characters = c.toCharArray();

    for(int i=0; i<Length; i++){
        if(characters[i] == 'I'){
            answer[i] = down;
            down++;  
        }else if(characters[i] == 'D'){
            answer[i] = up;
            up --;
        }
    }
    answer[Length] = down;
    System.out.println(Arrays.toString(answer));
}
}

