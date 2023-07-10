import java.util.Arrays;

public class NQueen {
	public static boolean checkQueen(char[][] maze, int r, int c, int n) {
		
		int x  = r-1;
		while(x >=0) {
			if(maze[x][c] == 'Q') return false;
			x--;
		}
		x = r-1;
		int y = c-1;
		while(x>=0  && y >= 0) {
			if(maze[x][y] == 'Q') return false;
			x--;
			y--;
		}
		x = r-1;
		 y = c+1;
		while(x>=0  && y < n) {
			if(maze[x][y] == 'Q') return false;
			x--;
			y++;
		}
		
		
//		for(int i  = r;i>=0;i--){
//			//System.out.println(i + " " + c);
//			if(maze[i][c] == 'Q') return false;
//		}
////		for(int i  = 0;i<n;i++) {
////			if(maze[r][i] == 'Q') return false;
////		}
////		
//		for(int i  =0 ;i<n;i++) {
//			for(int j = 0;j<n;j++) {
//				
//				
//				if(i-j==r-c){ //diagonal up_left to down_right
//			        maze[i][j]='Q';
//			        return false;
//			  }
//
//			  if(i+j==r+c) { //diagonal down_left to up_right
//			        maze[i][j]='Q';
//			        
//			        return false;
//			  }
//			}
//		}
//		
		return true;
	
	}
	public static void  printMaze(char[][] maze,int n) {
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
	}
    public static void nqueen(char[][] maze , int n ,int row) {
    	if(row == n) {
    		printMaze(maze, n);
    		System.out.println();
    		return;
    	}
    	for(int col = 0 ;col<n;col++) {
    	if(checkQueen(maze,row,col,n)) {
    	maze[row][col] = 'Q';
    	nqueen(maze, n, row+1);
    	maze[row][col] = '.';
    	}
    	
    	}
  	
    }
	public static void main(String[] args) {
		 
		int n =4;
		char[][] maze = new char[n][n];
	   for(char[] q : maze) {
		   Arrays.fill(q, '.');
	   }
		//maze[0]1] = 'Q';
		
		nqueen(maze, n, 0);
		
		
		
		
		
		//System.out.println(checkQueen(maze,3, 0, n));
		

	}

}
