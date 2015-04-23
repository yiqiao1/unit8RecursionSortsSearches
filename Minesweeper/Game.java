import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.awt.Color;

public class Game
{
    public static void main() 
    {
        System.setProperty("info.gridworld.gui.frametitle", "Minesweeper");

        //Instantiate minefield
        MineField field = new MineField(new BoundedGrid<Cell>(10, 10));

        //Randomly add in tiles
        for (int r = 0; r < field.getGrid().getNumRows(); r++) 
        {
            for (int c = 0; c < field.getGrid().getNumCols(); c++) 
            {
                Location tempLoc = new Location(r, c);
                field.add(tempLoc, new Cell(field, tempLoc, Color.GREEN));
            }
        }
        
        field.setMessage("Welcome to Minesweeper");
        
        field.show();
    }
}
