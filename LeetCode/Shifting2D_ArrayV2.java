import java.util.ArrayList;
import java.util.List;

public class Shifting2D_ArrayV2 {
  public static void main(String[] args) {
    int[][] grid = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };
  int k = 1;
  int m = grid.length;
  int n = grid[0].length;
  int temp, prev;

  while(k > 0){
      prev = grid[m - 1][n - 1];  // store the last element because it will be replaced first
      for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
              temp = grid[i][j];
              grid[i][j] = prev;
              prev = temp;
          }
      }
      k--;
  }

  for (int[] row : grid) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
  }

}
