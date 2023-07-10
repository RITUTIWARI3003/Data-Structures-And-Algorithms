import java.util.ArrayList;
import java.util.List;

public class PermutationOfStringInLexicographicalOrder {

	public void permuteHelper(int[] nums, List<List<Integer>> ans, List<Integer> ds, int[] visited) {
		if (ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				ds.add(nums[i]);
				permuteHelper(nums, ans, ds, visited);
				ds.remove(ds.size() - 1);
				visited[i] = 0;
			}
		}
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		int[] visited = new int[nums.length];
		permuteHelper(nums, ans, ds, visited);

		return ans;

	}

	public static void main(String[] args) {}}