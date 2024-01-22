import java.util.*;
class SubsequencesofString{
static void solve(int i, String s, String f) {
	if (i == s.length()) {
		System.out.print(f+" ");
		return;
	}
	//picking 
	//f = f + s.charAt(i);
	solve(i + 1, s,  f+s.charAt(i));
	//poping out while backtracking
	//f.pop_back();
	solve(i + 1, s,  f);
}
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string of which u want the all susbequences");
	String s = sc.nextLine();
	String f = "";
	System.out.println("All possible subsequences are: ");
	solve(0, s, f);
}
}