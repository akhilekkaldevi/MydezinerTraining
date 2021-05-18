/*2. write a program to check if two strings are anagram or not using HashMap.
    LISTEN
    SILENT
*/


import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		HashMap<Integer, Character> m1 = new HashMap<Integer, Character>();
		HashMap<Integer, Character> m2 = new HashMap<Integer, Character>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				m1.put(s1.charAt(i) + 0, s1.charAt(i));
			}
			for (int i = 0; i < s1.length(); i++) {
				m2.put(s2.charAt(i) + 0, s2.charAt(i));

			}
		}
		System.out.println(m1 + "\n" + m2);
		if (m1.equals(m2))
			System.out.println("given Strings are anagram");
		else
			System.out.println("given Strings are not anagram");
	}
}
