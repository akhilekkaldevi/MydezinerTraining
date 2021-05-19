/*2. write a program to check if two strings are anagram or not using HashMap.
    LISTEN
    SILENT
*/


import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		HashMap<Integer, Character> m = new HashMap<Integer, Character>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		Boolean answer =true;
		sc.close();
		if (s1.length() != s2.length()) {
			System.out.println("given Strings are not anagram");
		} 
		else{
			for (int i = 0; i < s1.length(); i++) {
				m.put(s1.charAt(i) + 0, s1.charAt(i));
			}
			for (int j = 0; j < s2.length(); j++) {
				if (!m.containsValue(s2.charAt(j)))
					answer=false;
			}
			if (answer)
				System.out.println("given Strings are anagram");
			else
				System.out.println("given Strings are not anagram");
		}
			
	}
}
