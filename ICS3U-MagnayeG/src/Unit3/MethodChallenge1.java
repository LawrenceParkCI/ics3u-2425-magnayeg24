package Unit3;

/**
Description: This is a method challenge worksheet
Date: 12/17/2024
@author Gabriel Magnaye
*/

public class MethodChallenge1 {
   public static void main( String[] args ) {
       // Complete the function below. Don't forget to comment.
       double d1 = distance(-2, 1, 1, 5);
       System.out.println(" (-2,1) to (1,5) => " + d1 );

       double d2 = distance(-2, -3, -4, 4);
       System.out.println(" (-2,-3) to (-4,4) => " + d2 );

       System.out.println(" (2,-3) to (-1,-2) => " + distance(2, -3, -1, -2) );

       System.out.println(" (4,5) to (4,5) => " + distance(4, 5, 4, 5) );
   }

   /**
    * This method calculates the distance between two points.
    * 
    * @param x1 The x-coordinate of the first point.
    * @param y1 The y-coordinate of the first point.
    * @param x2 The x-coordinate of the second point.
    * @param y2 The y-coordinate of the second point.
    * @return The distance between the two points.
    */
   public static double distance(int x1, int y1, int x2, int y2) {
       // Calculate the difference in x and y coordinates
       int dx = x2 - x1;
       int dy = y2 - y1;

       // Apply the distance formula
       return Math.sqrt(dx * dx + dy * dy);
   }
}
