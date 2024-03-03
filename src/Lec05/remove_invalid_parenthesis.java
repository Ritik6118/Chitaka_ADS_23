package Lec05;
import java.util.*;

public class remove_invalid_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	HashSet<String> set=new HashSet<>();
  	List<String> li=new ArrayList<>();
    public List<String> removeInvalidParentheses(String s) {
      int min=min(s);
		  generate(s,0,"",s.length()-min,0,0);
      return li;     
    }
    private void generate(String s, int i, String ans, int len, int open, int close) {
		// TODO Auto-generated method stub
		if(i==s.length()) {
			if(open!=close || ans.length()<len || ans.length()>len) {
				return;
			}
			if(!set.contains(ans)) {
				set.add(ans);
				li.add(ans);
			}
			return;
		}
		if(s.charAt(i)=='(') {
			if(open<len/2) {
				generate(s,i+1,ans+'(',len,open+1,close);
			}
			generate(s,i+1,ans,len,open,close);
			
		}
		else if(s.charAt(i)==')') {
			if(close<open) {
				generate(s,i+1,ans+')',len,open,close+1);
			}
			generate(s,i+1,ans,len,open,close);
			
		}
		else {
			generate(s,i+1,ans+s.charAt(i),len,open,close);
		}
	}

	private int min(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push('(');
			}
			else if(s.charAt(i)==')') {
				if(st.isEmpty()||st.peek()==')') {
					st.push(')');
				}
				else {
					st.pop();
				}
			}
		}
		return st.size();
	}

}
