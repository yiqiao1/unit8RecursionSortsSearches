import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 19 rows and 19 columns
    private final int ROWS = 16;
    private final int COLS = 16;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the 45 intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(5, 5);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(5, 6);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(5, 7);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(5, 8);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(5, 9);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(5, 10);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(5, 11);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(5, 12);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(5, 13);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(6, 5);
        grid.put(loc10, rock10);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(6, 13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(7, 5);
        grid.put(loc14, rock14);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(7, 13);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(8, 5);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(8, 7);
        grid.put(loc19, rock19);

        Rock rock21 = new Rock();
        Location loc21 = new Location(8, 13);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(9, 5);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(9, 9);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(9, 13);
        grid.put(loc24, rock24);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(13, 5);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(13, 6);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(13, 7);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(13, 8);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(13, 9);
        grid.put(loc29, rock29);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(13, 10);
        grid.put(loc30, rock30);
        
        Rock rock31 = new Rock();
        Location loc31 = new Location(13, 11);
        grid.put(loc31, rock31);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(13, 12);
        grid.put(loc32, rock32);
        
        Rock rock33 = new Rock();
        Location loc33 = new Location(13, 13);
        grid.put(loc33, rock33);
        
        Rock rock34 = new Rock();
        Location loc34 = new Location(12, 5);
        grid.put(loc34, rock34);
        
        Rock rock37 = new Rock();
        Location loc37 = new Location(12, 13);
        grid.put(loc37, rock37);
        
        Rock rock38 = new Rock();
        Location loc38 = new Location(11, 5);
        grid.put(loc38, rock38);
        
        Rock rock41 = new Rock();
        Location loc41 = new Location(11, 13);
        grid.put(loc41, rock41);
        
        Rock rock42 = new Rock();
        Location loc42 = new Location(10, 5);
        grid.put(loc42, rock42);
        
        Rock rock43 = new Rock();
        Location loc43 = new Location(10, 6);
        grid.put(loc43, rock43);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(10, 10);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(10, 11);
        grid.put(loc16, rock16);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(10, 12);
        grid.put(loc20, rock20);
        
        Rock rock44 = new Rock();
        Location loc44 = new Location(10, 7);
        grid.put(loc44, rock44);
        
        Rock rock45 = new Rock();
        Location loc45 = new Location(10, 13);
        grid.put(loc45, rock45);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // create a new grid that shows the next generation
        BoundedGrid<Actor> grid1 = new BoundedGrid<Actor>(ROWS, COLS);
        
        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                // goes through every location in the grid, 
                Location loc = new Location(row, col);
                Actor actor = grid.get(loc);
                
                ArrayList<Location> neighbors = new ArrayList<Location>();
                neighbors = grid.getOccupiedAdjacentLocations(loc);
                
                int numNeighbors = neighbors.size();
                
                if (actor == null)
                // if the location is empty and there are exactly 3 neighbors around it, place a rock in that location in the new grid
                {
                    if (numNeighbors == 3)
                    {
                        Rock rock1 = new Rock();
                        grid1.put(loc, rock1);
                    }
                }
                else
                // if the location has an actor and the actor has exactly 2 or 3 neighbors, place a rock in that location in the new grid
                {
                    if (numNeighbors == 2 || numNeighbors == 3)
                    {
                        Rock rock2 = new Rock();
                        grid1.put(loc, rock2);
                    }
                }
            }
        }
        
        world.setGrid(grid1);
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
        throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        
        // creates pause of 100 ms between each generation
        while (true)
        {
            game.createNextGeneration();
            Thread.sleep(100);
        }
    }

}


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardComponent extends JComponent
{
    private final int NUM_IMAGES = 13;
    private final int CELL_SIZE = 15;

    private boolean inGame;
    private Image[] img;

    public BoardComponent() 
    {
        img = new Image[NUM_IMAGES];

        for (int i = 0; i < NUM_IMAGES; i++) 
        {
            img[i] = (new ImageIcon(i + ".png")).getImage();
        }

        setDoubleBuffered(true);

        addMouseListener(new MinesAdapter());
        Game game = new Game();
    }

    public void paintComponent(Graphics g) 
    {
        int cell = 0;
        int uncover = 0;

        for (int i = 0; i < N_ROWS; i++) 
        {
            for (int j = 0; j < N_COLS; j++) 
            {

                cell = field[(i * N_COLS) + j];

                if (inGame && cell == MINE_CELL)
                    inGame = false;

                if (!inGame) {
                    if (cell == COVERED_MINE_CELL) {
                        cell = DRAW_MINE;
                    } else if (cell == FLAGGED_MINE_CELL) {
                        cell = DRAW_FLAG;
                    } else if (cell > COVERED_MINE_CELL) {
                        cell = DRAW_WRONG_FLAG;
                    } else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                    }


                } else {
                    if (cell > COVERED_MINE_CELL)
                        cell = DRAW_FLAG;
                    else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                        uncover++;
                    }
                }

                g.drawImage(img[cell], (j * CELL_SIZE),
                    (i * CELL_SIZE), this);
            }
        }

        if (uncover == 0 && inGame) {
            inGame = false;
            statusbar.setText("Game won");
        } else if (!inGame)
            statusbar.setText("Game lost");
    }


    class MinesAdapter extends MouseAdapter 
    {
        @Override
        public void mousePressed(MouseEvent e) {

            int x = e.getX();
            int y = e.getY();

            int cCol = x / CELL_SIZE;
            int cRow = y / CELL_SIZE;

            boolean rep = false;


            if (!inGame) 
            {
                newGame();
                repaint();
            }


            if ((x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE)) 
            {
                if (e.getButton() == MouseEvent.BUTTON3) 
                {

                    if (field[(cRow * N_COLS) + cCol] > MINE_CELL) 
                    {
                        rep = true;

                        if (field[(cRow * N_COLS) + cCol] <= COVERED_MINE_CELL) 
                        {
                            if (mines_left > 0) 
                            {
                                field[(cRow * N_COLS) + cCol] += FLAG_FOR_CELL;
                                mines_left--;
                            } 
                        } 
                        else 
                        {

                            field[(cRow * N_COLS) + cCol] -= FLAG_FOR_CELL;
                            mines_left++;
                        }
                    }

                } 
                else 
                {

                    if (field[(cRow * N_COLS) + cCol] > COVERED_MINE_CELL) 
                    {
                        return;
                    }

                    if ((field[(cRow * N_COLS) + cCol] > MINE_CELL) &&
                        (field[(cRow * N_COLS) + cCol] < FLAGGED_MINE_CELL)) 
                    {

                        field[(cRow * N_COLS) + cCol] -= COVER_FOR_CELL;
                        rep = true;

                        if (field[(cRow * N_COLS) + cCol] == MINE_CELL)
                        {
                            inGame = false;
                        }
                        if (field[(cRow * N_COLS) + cCol] == EMPTY_CELL)
                        {
                            find_empty_cells((cRow * N_COLS) + cCol);
                        }
                    }
                }

                if (rep)
                {
                    repaint();
                }

            }
        }
    }
}