package RectangleOverlap;

public class Rectangle {

	Coordinate rectangle1LeftTop;

	Coordinate rectangle1RightBottom;

	Coordinate rectangle2LeftTop;

	Coordinate rectangle2RightBottom;

	
	public Rectangle(Coordinate rectangle1LeftTop, Coordinate rectangle1RightBottom, Coordinate rectangle2LeftTop,
			Coordinate rectangle2RightBottom) {
		
		this.rectangle1LeftTop = rectangle1LeftTop;
		this.rectangle1RightBottom = rectangle1RightBottom;
		this.rectangle2LeftTop = rectangle2LeftTop;
		this.rectangle2RightBottom = rectangle2RightBottom;
	}

	public void checkRectangle(Coordinate rectangle1LeftTop, Coordinate rectangle1RightBottom,
			Coordinate rectangle2LeftTop, Coordinate rectangle2RightBottom) {

		
		if (rectangle1RightBottom.x < rectangle2LeftTop.x || rectangle2RightBottom.x < rectangle1LeftTop.x)
			System.out.println("Rectangles do not overlap");
		else if (rectangle1RightBottom.y > rectangle2LeftTop.y || rectangle2RightBottom.y > rectangle1LeftTop.y)
			System.out.println("Rectangles do not overlap");
		else
			System.out.println("Rectangles are overlapping");
		
	}

}
