import java.util.Scanner;

public class OverlapRectangles{
    double x, y;
		
	OverlapRectangles(double x, double y){
		this.x = x;
		this.y = y;
	}
 
	
    // method for checking whether the rectangles are overlapping or not
    static boolean overlapOrNot(OverlapRectangles bl1, OverlapRectangles tr1, OverlapRectangles bl2, OverlapRectangles tr2){
        if(tr1.x <= bl2.x || tr2.x <= bl1.x)
            return false;
        if(bl1.y >= tr2.y || bl2.y >= tr1.y)
            return false;
        return true;
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Give bottom-left and top-right co-ordinates of a rectangle.
		System.out.println("Give Bottom-Left and Top-Right co-ordinates of Rectangle");
	    OverlapRectangles bl1 = new OverlapRectangles(scanner.nextDouble(),scanner.nextDouble());
	    OverlapRectangles tr1 = new OverlapRectangles(scanner.nextDouble(),scanner.nextDouble());
	    OverlapRectangles bl2 = new OverlapRectangles(scanner.nextDouble(),scanner.nextDouble());
	    OverlapRectangles tr2 = new OverlapRectangles(scanner.nextDouble(),scanner.nextDouble());
	    
		// calling method for checking overlapping condition
	    if(overlapOrNot(bl1,tr1,bl2,tr2)){
	        System.out.println("Rectangles are Overlapped");
	    }
	    else{
	        System.out.println("Rectangles are not Overlapped");
	    }
	}
}