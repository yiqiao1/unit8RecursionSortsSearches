import java.awt.*;
import javax.swing.JPanel;

public class TreeComponent extends JPanel
{
   private final int PANEL_WIDTH = 500;
   private final int PANEL_HEIGHT = 500;

   private final int TOPX = 250, TOPY = 400;
   private final int BOTTOMX = 250, BOTTOMY = 500;
   
   private final double ANGLE = 0;
   private final double ANGLEADD = Math.PI / 8;
   private final double BRANCHLENGTH = 100;
   private final double BRANCHSHRINK = .8;

   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public TreeComponent (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise two new branch points
   //  are computed, and each line segment is drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (int order, int x1, int y1, int x2, int y2, double currentAngle, double currentLength,
                            Graphics page)
   {
      int x3, y3, x4, y4;
      double newAngleRight, newAngleLeft, newLength;

      if (order == 1)
      {
         page.drawLine (x1, y1, x2, y2);
      }
      else
      {
         page.drawLine (x1, y1, x2, y2);
          
         newLength = currentLength * BRANCHSHRINK;
         newAngleRight = currentAngle + ANGLEADD;
         newAngleLeft = currentAngle - ANGLEADD;
         
         x3 = x1 + (int)(newLength * Math.sin(newAngleRight));
         y3 = y1 - (int)(newLength * Math.cos(newAngleRight));
         
         x4 = x1 + (int)(newLength * Math.sin(newAngleLeft));
         y4 = y1 - (int)(newLength * Math.cos(newAngleLeft));
          
         page.drawLine(x3, y3, x1, y1);
         page.drawLine(x4, y4, x1, y1);
         
         drawFractal (order-1, x3, y3, x1, y1, newAngleRight, newLength, page);
         drawFractal (order-1, x4, y4, x1, y1, newAngleLeft, newLength, page);
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      page.setColor (Color.green);

      drawFractal (current, TOPX, TOPY, BOTTOMX, BOTTOMY, ANGLE, BRANCHLENGTH, page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
