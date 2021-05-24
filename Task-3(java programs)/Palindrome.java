import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    String string;
	    Scanner sc = new Scanner(System.in);
	    string = sc.nextLine();
	    
	    if(isPalindrome(string,0,string.length()-1)){
	        System.out.println("String \"" + string + "\" is palindrome.");
	    }
	    else{
	        System.out.println("String \"" + string + "\" is not palindrome.");
	    }
	}
	// logic to check string palindrome using recursion
	static boolean isPalindrome(String string, int start, int end){
	    string = string.toLowerCase();
		//basecase
	    if(string.length() == 0 || string.length() == 1 || start >= end)
	        return true;
	    //main logic
	    if(string.charAt(start) != string.charAt(end))
	        return false;
	    else
	        return isPalindrome(string, start+1, end-1);
	}
}