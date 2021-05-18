package RectangleOverlap;

public class RectangleOverlap {
	public void checkRectangle() {
		Rectangle r1 = new Rectangle(new Coordinate(0, 5), new Coordinate(7, 0));
		Rectangle r2 = new Rectangle(new Coordinate(6, 7), new Coordinate(10, 6));
		Boolean ans = rectangleOverlap(r1.leftTop, r1.rightBottom, r2.leftTop, r2.rightBottom);
		if (ans)
			System.out.println("Rectangles are overlapping");
		else
			System.out.println("Rectangles do not overlap");
	}

	public static Boolean rectangleOverlap(Coordinate leftTop1, Coordinate rightBottom1, Coordinate leftTop2,Coordinate rightBottom2) {
		if (rightBottom1.x < leftTop2.x || rightBottom2.x < leftTop1.x)
			return false;
		else if (rightBottom1.y > leftTop2.y || rightBottom2.y > leftTop1.y)
			return false;
		return true;
	}
}
