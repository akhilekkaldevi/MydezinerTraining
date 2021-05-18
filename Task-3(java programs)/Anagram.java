import java.util.HashMap;
import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args) {
		String string1,string2;
		Scanner sc = new Scanner(System.in);
		string1 = sc.nextLine();    // Inputting 1st string
		string2 = sc.nextLine();    // Inputting 2nd string
		
		/* Converting both strings to lowercase */
		string1 = string1.toLowerCase(); 
		string2 = string2.toLowerCase();
		
		/* Calling isAnagram() method for checking strings are anagram or not */
		if(isAnagram(string1, string2)){
		    System.out.println("Strings are Anagram");
		}
		else{
		    System.out.println("Strings are not Anagram");
		}
	}
	
	static boolean isAnagram(String string1, String string2){
	    
	    HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		if(string1.length() != string2.length()){
		    return false;
		}
		/* Cheking whether the string contains particular character and incrementing the count of respective character */
		for(int i = 0; i < string1.length(); i++){
		    char character = string1.charAt(i);
		    if(hashmap.containsKey(character)){
		        hashmap.put(character,hashmap.get(character)+1);
		    }
		    else{
		        hashmap.put(character,1);
		    }
		}
		
		/* Comparing 2nd string characters with 1st string characters and decrementing the count in Hashmap */
		for(int i = 0; i < string2.length(); i++){
		    char character = string2.charAt(i);
		    if(hashmap.containsKey(character)){
		        hashmap.put(character,hashmap.get(character)-1);
		    }
		    else{
		        return false;
		    }
		}
		return true;
	}
}



