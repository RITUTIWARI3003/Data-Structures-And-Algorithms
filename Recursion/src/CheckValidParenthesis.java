
public class CheckValidParenthesis {

	public static boolean isValidRec(String s, int i, String ans, int j) {
		if (i == s.length())
			return true;
		if (j != 0 && i == s.length())
			return false;
		else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
			ans = ans + String.valueOf(s.charAt(i));
			return isValidRec(s, i + 1, ans, j + 1);
		}
		//if (ans.length() >= 1) {
			if ((s.charAt(i) == ')' && ans.charAt(ans.length() - 1) == '(')
					|| (s.charAt(i) == '}' && ans.charAt(ans.length() - 1) == '{')
					|| (s.charAt(i) == ']' && ans.charAt(ans.length() - 1) == '[')) {
				ans = ans.substring(0,ans.length()-1);
				return isValidRec(s, i + 1, ans, j - 1);
			}
		//}
			

		return false;
	}

	public static boolean isValid(String s) {

		if (s.length() == 0)
			return true;
		if (s.length() == 1)
			return false;
		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;
		return isValidRec(s, 1, String.valueOf(s.charAt(0)), 1);

	}

	public static void main(String[] args) {
//		String ans = "(([]){})";
//		ans = ans.replace(String.valueOf(ans.lastIndexOf(ans.charAt(ans.length() - 1),0)), "");
//		System.out.println(ans);
	  System.out.println(isValid("(([]){})"));
	}

}
