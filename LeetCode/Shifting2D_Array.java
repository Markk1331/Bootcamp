import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shifting2D_Array {
  public static void main(String[] args) {
    int[][] grid = new int[][] 
    {{1,2,3},
    {4,5,6},
    {7,8,9}};
    int k = 1;
    int m = grid.length;
    int n = grid[0].length;
    int temp = 0;
    int temp1 = 0;
    // int totalelements = m*n;
    // int[] vector = new int[totalelements];
    List<List<Integer>> matrixList = new ArrayList<>();
   // List<Integer> rowList = new ArrayList<>();

    while(k>0){
      temp1= grid[0][0];
      for(int i=0; i<m; i++){ //row
        for(int j=0; j<n; j++){ //column
         
          if(j<grid[i].length-1){
            // temp = grid[i][j+1];
            // grid[i][j+1] = grid[i][j];
            // grid[i][j] = temp;
            temp = grid[i][j];
            grid[i][j] = grid[i][j+1];
            grid[i][j+1] = temp;

            }
         if(j == grid[i].length-1 && i!=grid[j].length-1 ){
            // temp = grid[i+1][0] ;
            // grid[i+1][0] = grid[i][n-1];
            // grid[i][n-1] = temp;

            temp = grid[i][n-1] ;
            grid[i][n-1] = grid[i+1][0];
            grid[i+1][0] = temp;

            }
          if(j == grid[i].length-1 && i==grid[j].length-1){
            grid[m-1][n-1] = temp1;
            // grid[0][0] = grid[m-1][n-1];
            }
        }
        
      }
      k--;
    }
    for (int[] row : grid) {
      List<Integer> rowList = new ArrayList<>();
      for (int element : row) {
          rowList.add(element);
      }
        matrixList.add(rowList);
    System.out.println(rowList);
  }

  System.out.println(matrixList);
  
}
}
