import java.util.*;
import java.io.*;
class Anagram
{
    boolean anagram(String s1,String s2)
    {
        HashMap<Character,Integer>h=new HashMap<Character,Integer>();
        HashMap<Character,Integer>h1=new HashMap<Character,Integer>();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            if(h.get(arr1[i])==null)
            h.put(arr1[i],1);
            else
            {
            int c=(int)h.get(arr1[i]);
            h.put(arr1[i],++c);
            }
        }
        for(int j=0;j<arr2.length;j++)
        {
            if(h1.get(arr2[j])==null)
            h1.put(arr2[j],1);
            else
            {
            int d=(int)h1.get(arr2[j]);
            h1.put(arr2[j],++d);
            }
        }
        if(h.equals(h1))
        return true;
        else
        return false;
    }
}
class Sai
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	Anagram a=new Anagram();
    if(a.anagram(s1,s2))
    System.out.println("The two strings are anagram");
    else
    System.out.println("The two strings are not anagram");
    }
}