import java.util.Arrays;

public class FlippingImage {
public static void main(String[] args) {
  int[][] image = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
  
  int rows = image.length;
  int columns = image[0].length;
  int[][] newArray = new int[rows][columns];
  
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns / 2; j++) {
        int temp = image[i][j];
        image[i][j] = image[i][columns - 1 - j];
        image[i][columns - 1 - j] = temp;
    }
}

newArray = image;

       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        newArray = image;

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}