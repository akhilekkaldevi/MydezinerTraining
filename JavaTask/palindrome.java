
import java.util.*;
import java.io.*;
class Palindrome
{
    boolean isPalindrome(String str,int firstCharIndexNumber,int lastCharIndexNumber)
    {
        char charArray[]=str.toCharArray();
        if(firstCharIndexNumber==lastCharIndexNumber)
        return true;
        if(charArray[firstCharIndexNumber]==charArray[lastCharIndexNumber])
        return isPalindrome(str,firstCharIndexNumber+1,lastCharIndexNumber-1);
        else
        return false;
    }
}
 class PalindromeExample 
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int firstCharIndexNumber=0;
		int lastCharIndexNumber =str.length()-1;
		Palindrome p=new Palindrome();
		if(p.isPalindrome(str,firstCharIndexNumber,lastCharIndexNumber))
		System.out.println("Given string is a palindrome");
		else
		System.out.println("Given string is not a palindrome");
	}
}
