public class SudokuSolver {
    private int gridSize;
    private int coll;
    private int rowl;
public static void main(String[] args) {

char[][] board = new char[][]  {
{'9', '7', '.', '.', '.', '4', '.', '.', '.'},
{'3', '.', '.', '7', '.', '.', '.', '9', '5'},
{'.', '.', '.', '.', '.', '.', '.', '.', '2'},
{'.', '.', '.', '9', '.', '.', '2', '.', '.'},
{'1', '.', '.', '.', '.', '.', '4', '.', '.'},
{'.', '.', '5', '.', '.', '6', '.', '1', '9'},
{'.', '.', '6', '.', '8', '.', '.', '.', '.'},
{'5', '.', '.', '4', '.', '.', '.', '3', '7'},
{'.', '.', '.', '.', '.', '.', '1', '.', '.'}
};

        SudokuSolver ss = new SudokuSolver();
        ss.solveSudoku(board);

    

}

public void solveSudoku(char[][] board) {
    this.gridSize = 9;
    this.coll = board.length;
    this.rowl = board[0].length;
    if (solveboard(board)){
        printBoard(board);
    }else{
        System.out.println("not printable");
    };
    
    
}


//column checker
public boolean columnChecker(char[][] board, int column, char num){ //find the number in the column
    for(int i=0; i<gridSize;i++){
        if(board[i][column] == num)
            return true;
        }
        return false;
    }
    

//row checker
public boolean rowChecker(char[][] board, int row, char num){
    for(int j =0; j<gridSize; j++){
        if(board[row][j]==num)
            return true;
    }
    return false;
}

//3X3 box chkecter
public boolean boxChecker(char[][] board, char num, int column, int row){

    int localrow = row-row%3;
    int localcolumn = column - column%3;
    for(int i=localrow; i<localrow+3; i++){
        for(int j=localcolumn; j<localcolumn+3; j++){
            if(board[i][j] == num)
                return true;
        }
    }
    return false;
}

//consolidation of the first 3 methods
public boolean validator(char[][] board, int row, int column, char num) {
    return !boxChecker(board, num, column, row) && !rowChecker(board, row, num) &&
            !columnChecker(board, column, num);
}


 public boolean solveboard(char[][] board) {
    for (int row = 0; row < gridSize; row++) {
        for (int column = 0; column < gridSize; column++) {
            if (board[row][column] == '.') {
                for (char numberToTry = '1'; numberToTry <= '9'; numberToTry++) {
                    if (validator(board, row, column, numberToTry)) {
                        board[row][column] = numberToTry;
                        if (solveboard(board)) {
                            return true;
                        } else {
                            board[row][column] = '.'; // Reset to empty cell if the solution is not valid
                        }
                    }
                }
                return false;
            }
        }
    }
    return true; // Exit the method after the board is solved
}


public void printBoard(char[][] board) {
    for (int row = 0; row < gridSize; row++) {
        for (int column = 0; column < gridSize; column++) {
            System.out.print(board[row][column] + " ");
        }
        System.out.println();
    }
}

}
