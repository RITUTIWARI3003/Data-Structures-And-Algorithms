import java.util.ArrayList;

public class FindAllPossiblePalindromicSeqInAString {
	
	 static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
         ArrayList<String> list = new ArrayList<>();
         ArrayList<ArrayList<String>> result = new ArrayList<>();
         form(S,list,result,0);
         return result;
}
static void form(String s, ArrayList<String> list,  ArrayList<ArrayList<String>> result, int index){
       if(index == s.length()){
           result.add(new ArrayList<>(list));
           return;
       }
       String temp = "";
       for(int i = index; i< s.length(); i++){
             temp+= s.charAt(i);
             if(isPalin(temp)){ 
              list.add(temp);  
                 form(s,list,result,i+1);
                 list.remove(list.size()-1);
             }
             else continue;
       }
}
static boolean isPalin(String tocheck){
    if(tocheck.length() < 2) return true;
   int i = 0;int j = tocheck.length()-1;
   while(i < j){
       if(tocheck.charAt(i) != tocheck.charAt(j)) return false;
       i++; j--;
   }
   return true;
}

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
		ans = allPalindromicPerms("geeks");
		System.out.println(ans);

	}

}
