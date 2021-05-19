class GFG {
 
    int x,y;
   GFG(int x,int y) {
  
        this.x=x;
        this.y=y;
     }
  

  static  boolean doOverlap(GFG l1, GFG r1, GFG l2, GFG r2) {
          
     
           if (l1.x == r1.x || l1.y == r2.y || l2.x == r2.x || l2.y == r2.y)
             {
                  
                 return false;
             }
     
     
         
         if (l1.x >= r2.x || l2.x >= r1.x) {
             return false;
         }
         if (l1.y <= r2.y || l2.y <= r1.y) {
             return false;
         }
  
         return true;
     }
     public static void main(String[] args) {
         GFG l1 = new GFG(0,10),r1 = new GFG(10,0);
        GFG  l2 = new GFG(5,5),r2 = new GFG(15,0);
  
         if (doOverlap(l1, r1, l2, r2)) {
             System.out.println("Rectangles Overlap");
         } else {
             System.out.println("Rectangles Don't Overlap");
         }
     }
    }

 
 
 
 
 