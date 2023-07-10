
public class SudokuSolver {
     public static boolean check(char[][] grid,int r,int c ,char digit) {
    	 for(int i = 0;i< 9;i++) {
    		 if(grid[r][i] == digit) return false;
    	 }
    	 for(int i = 0;i< 9;i++) {
    		 if(grid[i][c] == digit) return false;
    	 }
    	 
    	 for(int i = 0;i< 9;i++) {
    		 if(grid[i][c] == digit) return false;
    	 }
    	 int row = (r/3)*3;
         int col = (c/3)*3;
         for (int i = row; i < row+3; i++) {
             for (int j = col; j < col+3; j++) {
                 if (grid[i][j] == digit) {
                     return false;
                 }
             }
         }
         return true;
     }
	public static void main(String[] args) {
		
		char[][] board = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
{'7','.','.','.','2','.','.','.','6'},
{'.','6','.','.','.','.','2','8','.'},
{'.','.','.','4','1','9','.','.','5'},
{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(check(board, 0, 2, '4'));
                }
}
				
		

	


