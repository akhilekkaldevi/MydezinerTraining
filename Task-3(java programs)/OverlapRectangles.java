import java.util.Scanner;
public class OverlapRectangles
{
    static class Point{
        double x, y;
    }
    
    static boolean overlapOrNot(Point bl1, Point tr1, Point bl2, Point tr2){
        if(tr1.x <= bl2.x || tr2.x <= bl1.x)
            return false;
        if(bl1.y >= tr2.y || bl2.y >= tr1.y)
            return false;
        return true;
    }
    
	public static void main(String[] args) {
	    Point bl1 = new Point();
	    Point tr1 = new Point();
	    Point bl2 = new Point();
	    Point tr2 = new Point();
	    Scanner scanner = new Scanner(System.in); 
	    bl1.x = scanner.nextDouble();
	    bl1.y = scanner.nextDouble();
	    tr1.x = scanner.nextDouble();
	    tr1.y = scanner.nextDouble();
	    bl2.x = scanner.nextDouble();
	    bl2.y = scanner.nextDouble();
	    tr2.x = scanner.nextDouble();
	    tr2.y = scanner.nextDouble();
	 
	    if(overlapOrNot(bl1,tr1,bl2,tr2)){
	        System.out.println("Rectangles are Overlapped");
	    }
	    else{
	        System.out.println("Rectangles are not Overlapped");
	    }
	}
}