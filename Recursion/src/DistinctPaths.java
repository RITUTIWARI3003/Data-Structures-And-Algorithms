import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Pair {
	int row;
	int col;

	Pair(int row, int col) {
		this.row = row;
		this.col = col;
	}

	@Override
	public String toString() {
		return "( " + row + " " +  col + " )" ;
	}
	
}

public class DistinctPaths {

	public static void findPaths(int[][] grid,List<List<Pair>> ds, List<Pair> ans, int n, int m, int row, int col) {

		if (row == n - 1 && col == m - 1 ) {
			ds.add(new ArrayList<>(ans));
			return;
		}
		//if(grid[row][col] == 0) return;
		if(grid[row][col] == 1)
		ans.add(new Pair(row,col));
		
		if(row == n-1) {
			findPaths(grid, ds,ans, n, m, row, col+1);
			
		}else if(col == m-1) {
			findPaths(grid, ds,ans, n, m, row+1, col);
		}else {
			if(row >= 0 && row <n && col >= 0 && col < m) {
			findPaths(grid, ds,ans, n, m, row, col+1);
			//ans.remove(ans.size()-1);
			findPaths(grid, ds,ans, n, m, row+1, col);
			ans.remove(ans.size()-1);
		}
		}
	
		
		
		return;
//		  if(grid[row][col] == 0) {
//			return;
//		}
		//ans.add(new Pair(row, col));
//		int[] delrow = { 0, 1 };
//		int[] delcol = { 1, 0 };
//		for (int i = 0; i < 2; i++) {
//			int nrow = row + delrow[i];
//			int ncol = col + delcol[i];
//			if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1) {
//				ans.add(new Pair(nrow,ncol));
//				findPaths(grid, ds,ans, n, m, nrow, ncol);
//				//ans.remove(ans.size() - 1);
//			}
//
//		}

	}

	public static void main(String[] args) {
		List<List<Pair>> ds = new ArrayList<>();
		List<Pair> ans = new ArrayList<>();
		int[][] grid = { { 1, 0, 0, 0 }, 
				         { 1, 1, 0, 1 }, 
				         { 1, 1, 0, 0 }, 
				         { 1, 1, 1, 1 } };
		int n = grid.length;
		int m = grid[0].length;
		ans.add(new Pair(0,0));
		findPaths(grid, ds ,ans, n, m, 0, 0);
		System.out.println(ans);
		
	}

}
