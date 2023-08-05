import java.util.Arrays;

public class Convert1D_to_2D {

  public static void main(String[] args) {
    int[] original = new int[] {3};
    int m =1; //row
    int n = 2; //column

    if(original.length != m*n){
      System.out.println("no 2D");
    }else{
    int idx = 0;
    int[][] news = new int[m][n];
    for(int i=0; i<m;i++){ //row
      for(int j=0; j<n; j++){ //column
        news[i][j] = original[idx];
        idx++;

      }
    }
    System.out.println(Arrays.deepToString(news));

    }



  }
  
}
