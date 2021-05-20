import java.util.HashMap;
import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args) {
		String firstString,secondString;
		Scanner sc = new Scanner(System.in);
		firstString = sc.nextLine();    // Inputting 1st string
		secondString = sc.nextLine();    // Inputting 2nd string
		
		/* Converting both strings to lowercase */
		firstString = firstString.toLowerCase(); 
		secondString = secondString.toLowerCase();
		
		/* Calling isAnagram() method for checking strings are anagram or not */
		if(isAnagram(firstString, secondString)){
		    System.out.println("Strings are Anagram");
		}
		else{
		    System.out.println("Strings are not Anagram");
		}
	}
	
	static boolean isAnagram(String firstString, String secondString){
	    
	    HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
		
		if(firstString.length() != secondString.length()){
		    return false;
		}
		/* Cheking whether the string contains particular character and incrementing the count of respective character */
		for(int i = 0; i < firstString.length(); i++){
		    char character = firstString.charAt(i);
		    if(characterCount.containsKey(character)){
		        characterCount.put(character,characterCount.get(character)+1);
		    }
		    else{
		        characterCount.put(character,1);
		    }
		}
		
		/* Comparing 2nd string characters with 1st string characters and decrementing the count in Hashmap */
		for(int i = 0; i < firstString.length(); i++){
		    char character = secondString.charAt(i);
		    if(characterCount.containsKey(character)){
		        characterCount.put(character,characterCount.get(character)-1);
		    }
		    else{
		        return false;
		    }
		}
		return true;
	}
}



