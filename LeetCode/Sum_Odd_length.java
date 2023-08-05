import java.util.Arrays;

public class Sum_Odd_length{

  public static void main(String[] args) {
    int[] arr = new int[] {1,2,2,1};
    
          int n = arr.length;
          int res = 0;
          for (int i = 0; i < n; i++) {
              for (int j = i; j < n; j++) {
                  if ((j - i + 1) % 2 == 0) 
                    continue;
                  for (int k = i; k <= j; k++) {
                      res += arr[k];
                  }
              }
          }
          System.out.println(res);
 



  }
}