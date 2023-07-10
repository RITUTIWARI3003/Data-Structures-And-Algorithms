import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
	
	 static String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


	 public static void recurse(String digits,ArrayList<String> ans,int i, String s){
	       if(digits.length() == i) {
	           ans.add(s);
	           return;
	       }

	       for(int j = 0;j<str[digits.charAt(i) - '0'].length();j++ ){
	           recurse(digits,ans,i+1,s+str[digits.charAt(i) -'0'].charAt(j));
	       } 
	         }



	    public static List<String> letterCombinations(String digits) {

	            ArrayList<String> s = new ArrayList<>();

	        if(digits.length()==0)

	            return s;

	        else{

	        recurse(digits,s,0,"");

	        return s;

	        }

	    }

	public static void main(String[] args) {
		String digits = "6";
		List<String> ans = new ArrayList<>();
		ans = letterCombinations(digits);
        System.out.println(ans);
	}

}
