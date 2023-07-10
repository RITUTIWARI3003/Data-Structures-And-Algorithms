import java.util.ArrayList;
import java.util.List;

public class PowerSetInLexographicOrder {
	public static void formSet(String s,String set,List<String> ans , int index,int n) {
		if(index == n ) {
		
			return;
		}
		for(int i = index;i<n;i++) {
		     set = set + s.charAt(i);
		 	 ans.add(set);
		     formSet(s, set, ans, i+1, n);
		     set = set.substring(0,set.length()-1);
		}
		return;
	}

	public static void main(String[] args) {
		
		String s = "abc";
		//If string is not sorted then first sort it and then do this algorithm
		List<String> ans = new ArrayList<>();
		formSet(s, "", ans, 0, s.length());
        System.out.println(ans);
	}

}
