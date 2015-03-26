import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import javax.swing.JPanel;

public class LogSpiralPanel extends JPanel
{
   private static final double GOLDEN_MEAN =  (1 + Math.sqrt(5)) / 2;

   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      double height = getHeight();
      double width = height*GOLDEN_MEAN;
      Rectangle largest = new Rectangle(0, 0, (int)width, (int)height);
      g2.draw(largest);
      recursiveDraw(g2, 0, 0, height, 90);
   }
   
   /**
      Method that recursively draws a logarithmic spiral.
      @param x The upper left corner x-coordinate of the golden rectangle
      @param y The upper left corner y-coordinate of the golden rectangle
      @param side the smallest side size of the golden rectangle
      @param angle The angle (0, 90, 180 or 270) where the top of the 
      current golden rectangle is located. For the outermost golden 
      rectangle, the angle is 90.
   */
   private void recursiveDraw(Graphics g2, double x, double y, double side, int angle)
   {
      // Recursion ending condition: when the side is very small
      if (side < 1)
      {
          
      }
      else
      // Draw the current square and arc
      {
         Rectangle square = new Rectangle((int)x, (int)y, (int)side, (int)side);
         this.drawArc(g2, x, y, side, angle);
         
         double newSide = (side*GOLDEN_MEAN) - side;
         
         int newAngle = angle + 90;
         if (newAngle > 270)
         {
             angle = 0;
         }
         
         double newX = calculateNewX(x, newAngle, side, newSide);
         double newY = calculateNewY(y, newAngle, side, newSide);
         
         this.recursiveDraw(g2, newX, newY, newSide, newAngle);
      }
   }
   
   /**
      Draws the arc of the current iteration.
      @param x The x-coordinate of the square's upper-left corner  
      @param y The y-coordinate of the square's upper-left corner
      @param side The size of the side of the square (or the arc's radius)
      @param angle The angle (0, 90, 180 or 270) where the top of the 
      current golden rectangle is located. For the outermost golden 
      rectangle, the angle is 90.
   */
   private void drawArc(Graphics g, double x, double y, double side, int angle)
   {
      double auxX = x;
      double auxY = y;
      if (angle == 0 || angle == 270 )
      {
         auxX = x - side;
      }
      if (angle == 270 || angle == 180)
      {
         auxY = y - side;
      }
      g.drawArc((int) auxX, (int) auxY, (int) side * 2, (int) side * 2, angle, 90);
   }   
   private double calculateNewX(double x, double angle, double side, double newSide)
   {
      if (angle == 0)
         x = x + side - newSide;
      else if (angle == 90)
         x = x + side;
      else if (angle == 270)
         x = x - newSide;
      return x;
   }

   private double calculateNewY(double y, double angle, double side, double newSide)
   {
      if (angle == 0)
         y = y + side;
      else if (angle == 180)
         y = y - newSide;
      else if (angle == 270)
         y = y + side - newSide;
      return y;
   }
}