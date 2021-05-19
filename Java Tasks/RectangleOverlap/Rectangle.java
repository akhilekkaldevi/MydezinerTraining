ackage RectangleOverlap;

public class Rectangle {

	Coordinate leftTop;

	Coordinate rightBottom;

	public Rectangle(Coordinate leftTop, Coordinate rightBottom) {
		
		this.leftTop = leftTop;
		this.rightBottom = rightBottom;
	}

	public void checkRectangle(Rectangle rectangle2) {
	
		if (this.rightBottom.x < rectangle2.leftTop.x || rectangle2.rightBottom.x < this.leftTop.x)
			System.out.println("Rectangles do not overlap");
		else if (this.rightBottom.y > rectangle2.leftTop.y || rectangle2.rightBottom.y > this.leftTop.y)
			System.out.println("Rectangles do not overlap");
		else
			System.out.println("Rectangles are overlapping");

	}

}
