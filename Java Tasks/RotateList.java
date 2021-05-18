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
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
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