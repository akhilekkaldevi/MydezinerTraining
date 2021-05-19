package RectangleOverlap;

public class RectangleApplication {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(new Coordinate(0, 5), new Coordinate(7, 0), new Coordinate(6, 7),
				new Coordinate(10, 6));
		r.checkRectangle(r.rectangle1LeftTop,r.rectangle1RightBottom,r.rectangle2LeftTop,r.rectangle2RightBottom);
	}
}

