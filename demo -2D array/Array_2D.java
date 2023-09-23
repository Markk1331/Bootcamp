import java.util.Arrays;
import java.util.Random;

public class Array_2D {
  public static void main(String[] args) {
    int[][] matrix = new int [3][4]; // [3] = row, [4] = coloumn

    //3 rows x 4 columns
    //convert int[3][4] into 2-D array, using 2 for-lops
    Random rand = new Random();
    System.out.println(matrix.length); //3 rows
    System.out.println(matrix[0].length); //4 coloumn length of row =0

      for(int i =0; i<matrix.length;i++){ //rows
        for(int j=0; j<matrix[0].length; j++){ //columns
          matrix[i][j] = new Random().nextInt(13);
        }
      }
      System.out.println(Arrays.deepToString(matrix));



        //convert 2d array to 1d array by one row index
      int idx = 0;
      int[] arr = new int[matrix.length * matrix[0].length]; //12
        for(int i =0; i<matrix.length;i++){
          for(int j=0; j<matrix[0].length; j++){
            arr[idx++] = matrix[i][j];
        }
      }
      System.out.println(Arrays.toString(arr));


      //convert to 1d array by string 
     String str= "";
        for(int i =0; i<matrix.length;i++){
          for(int j=0; j<matrix[0].length; j++){
            str += matrix[i][j];
        }
      }
          System.out.println(str);




        //raw way

        int[][][] arr3d = new int [1][2][3];
        int[][][][] arr4d = new int[1][2][3][4];

        Array_2D [][] demo = new Array_2D[2][2];
        // Array_2D [0][0] = new Array_2D();
        // Array_2D [0][1] = new Array_2D();
        // Array_2D [1][0] = new Array_2D();
        // Array_2D [1][1] = new Array_2D();


      String[][] strings = new String[][] {{"abc","def"}, {"xyz","ijk"}};
      for(int i=0; i<strings.length; i++){
        for(int j=0; j<strings[0].length; j++){
          System.out.println(strings[i][j]);
        }
      }

  }
}
