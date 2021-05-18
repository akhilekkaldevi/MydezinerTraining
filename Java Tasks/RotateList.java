/*
3. Write a program to rotate a list by a given distance
(Ex:- for list [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and given distance 5 
Output should be [6, 7, 8, 9, 10, 1, 2, 3, 4, 5] without using inbuilt methods and without using another list).

 */


import java.util.*;
import java.util.Scanner;

public class RotateList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int len = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter Rotation size");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int j, temp = list.get(0);
			for (j = 0; j < list.size() - 1; j++) {
				list.set(j, list.get(j + 1));
			}
			list.set(j, temp);
		}

		System.out.println(list);
		sc.close();
	}
}