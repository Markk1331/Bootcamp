import java.util.HashSet;

public class ValidSudoku {
  public static void main(String[] args) {
    char[][] board = {
      {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
  };
    HashSet coloumn = new HashSet<>();
    HashSet row  = new HashSet<>();
    

     // column checker
    for(int i=0; i<board.length; i++){ //row
      coloumn.clear();
        for(int j=0; j<board[0].length; j++){ //column
          if( board[i][j] != '.'){
            if (!(coloumn.add(board[i][j]))){
 
                System.out.println(false);
                 }
                // System.out.println(coloumn);
                }
        }
    }

    //row checker
     for(int j=0; j<board[0].length; j++){ //row
       row.clear();
         for(int i=0; i<board.length; i++){
           if( board[i][j] != '.'){
               if (!(row.add(board[i][j]))){
                //return false;
                System.out.println(false);
                 }
               System.out.println(row);
                }
         }
     }
    //inside each 3X3 box checker
      //int i: 0->3 , 3->6, 6->9
      //int j: 0->3 , 3->6, 6->8

      int p = 0;
      int u = 0;
      
      for (int w = 0; w < 3; w++) { // number of times vertically
          for (int k = 0; k < 3; k++) { // number of times horizontally
              HashSet<Character> block = new HashSet<>(); 
              for (int i = p; i < p + 3; i++) {
                  for (int j = u; j < u + 3; j++) {
                      if (board[i][j] != '.') {
                          if (!block.add(board[i][j])) {
                              System.out.println(false);                          
                          }
                      }
                  }
              }    
              //System.out.println(block);
              u += 3;
          }
          p += 3;
          u = 0;
      }
      System.out.println(true);
  
  }
}
