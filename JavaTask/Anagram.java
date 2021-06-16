import java.util.*;
import java.io.*;
class Anagram
{
    boolean isAnagram(String s1,String s2)
    {
        HashMap<Character,Integer>String1charlengthmap=new HashMap<Character,Integer>();
        HashMap<Character,Integer>String2charlengthmap=new HashMap<Character,Integer>();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            if(String1charlengthmap.get(arr1[i])==null)
            String1charlengthmap.put(arr1[i],1);
            else
            {
            int c=(int)String1charlengthmap.get(arr1[i]);
            String1charlengthmap.put(arr1[i],++c);
            }
        }
        for(int j=0;j<arr2.length;j++)
        {
            if(String2charlengthmap.get(arr2[j])==null)
            String2charlengthmap.put(arr2[j],1);
            else
            {
            int d=(int)String2charlengthmap.get(arr2[j]);
            String2charlengthmap.put(arr2[j],++d);
            }
        }
        if(String1charlengthmap.equals(String2charlengthmap))
        return true;
        else
        return false;
    }
}
class AnagramExample
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String string1=sc.nextLine();
	    String string2=sc.nextLine();
	Anagram a=new Anagram();
    if(a.isAnagram(string1,string2))
    System.out.println("The two strings are anagram");
    else
    System.out.println("The two strings are not anagram");
    }
}