
import java.util.*;
import java.io.*;
class Palindrome
{
    boolean check(String s,int f,int l)
    {
        char ch[]=s.toCharArray();
        if(f==l)
        return true;
        if(ch[f]==ch[l])
        return check(s,f+1,l-1);
        else
        return false;
    }
}
 class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int f=0;
		int l =s.length()-1;
		Palindrome p=new Palindrome();
		if(p.check(s,f,l))
		System.out.println("Given string is a palindrome");
		else
		System.out.println("Given string is not a palindrome");
	}
}
