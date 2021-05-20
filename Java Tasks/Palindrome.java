/*
  4. Write a program to check palindrome using recursion.
  
         512215
 */



import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String str = String.valueOf(n);
		int end = str.length() - 1;
		int start = 0;
		Boolean ans = checkPalindrome(str, start, end);
		if (ans==true)
			System.out.println("Given input is palindrome");
		else
			System.out.println("Given input is not a palindrome");
	}

	public static Boolean checkPalindrome(String str, int start, int end) {
		if (start >= end)
			return true;
		if (str.charAt(start) == str.charAt(end)) 
			return checkPalindrome(str, start + 1, end - 1);
		return false;

	}
}
