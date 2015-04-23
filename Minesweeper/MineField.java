import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.util.ArrayList;
import java.awt.*;
import java.lang.reflect.*;

public class MineField extends World<Cell>
{
    private boolean gameOver = false;

    //Instantiate minefield
    public MineField(Grid gr)
    {
        super(gr);
    }

    //When a mine cell is clicked, call its select method and check if the game is won
    public boolean locationClicked(Location loc)
    {
        Cell c = (Cell)this.getGrid().get(loc);
        
        if (!gameOver) 
        {
            c.select();
            checkWin();
        }
        
        return true;
    }

    //Determines if the player has won
    private void checkWin() 
    {
        ArrayList<Location> mines = this.getGrid().getOccupiedLocations();
        int notMines = 0;
        int selectedCells = 0;
        
        for (Location loc : mines) 
        {
            Cell c = (Cell)this.getGrid().get(loc);
            
            if (c.isSelected() && !c.isMine()) 
            {
                selectedCells++;
            }
            else if (!c.isMine()) 
            {
                notMines++;
            }
        }
        
        if (selectedCells == notMines) 
        {
            gameOver(true);
        }
    }

    //Iterates through all tiles, showing them so the user can see tiles with mines
    //boolean determines if the user won or lost
    public void gameOver(boolean win) 
    {
        // if gameOver == false return nothing and end method
        if (gameOver) 
        {
            return;
        }
        // win game
        else if (!gameOver && win) 
        {
            setMessage("GAME OVER! You win!");
        }
        // lose game
        else if (!(gameOver && win))
        {
            setMessage("GAME OVER! You lose!");
        }
        gameOver = true;
        
        ArrayList<Location> locations = this.getGrid().getOccupiedLocations();
        for (Location loc : locations) 
        {
            Cell tile = (Cell)this.getGrid().get(loc);
            tile.select();
        }
    }
}