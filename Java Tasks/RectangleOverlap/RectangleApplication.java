package RectangleOverlap;

public class RectangleApplication {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(new Coordinate(0, 5), new Coordinate(7, 0));
		Rectangle rectangle2 = new Rectangle(new Coordinate(6, 7),new Coordinate(10, 6));
		rectangle1.checkRectangle(rectangle2);
	}
}
