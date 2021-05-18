/*
Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates. 
l1: Top Left coordinate of first rectangle. 
r1: Bottom Right coordinate of first rectangle. 
l2: Top Left coordinate of second rectangle. 
r2: Bottom Right coordinate of second rectangle.
 */


public class Overlap {
	public static void main(String[] args) {
		Coordinate l1 = new Coordinate(0, 5);
		Coordinate r1 = new Coordinate(7, 0);
		Coordinate l2 = new Coordinate(8, 7);
		Coordinate r2 = new Coordinate(10, 6);
		Boolean ans = rectangleOverlap(l1, r1, l2, r2);
		if (ans)
			System.out.println("Rectangles are overlapping");
		else
			System.out.println("Rectangles do not overlap");
	}

	public static Boolean rectangleOverlap(Coordinate l1, Coordinate r1, Coordinate l2, Coordinate r2) {
		if (r1.x < l2.x || r2.x < l1.x)
			return false;
		else if (r1.y > l2.y || r2.y > l1.y)
			return false;
		return true;
	}
}

class Coordinate {
	public int x, y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
