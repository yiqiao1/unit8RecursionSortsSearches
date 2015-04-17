

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private final int COVER_FOR_CELL = 10;
    private final int FLAG_FOR_CELL = 10;
    private final int EMPTY_CELL = 0;
    private final int MINE_CELL = 9;
    private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;
    private final int FLAGGED_MINE_CELL = COVERED_MINE_CELL + FLAG_FOR_CELL;

    private final int DRAW_MINE = 9;
    private final int DRAW_COVER = 10;
    private final int DRAW_FLAG = 11;
    private final int DRAW_WRONG_FLAG = 12;
    
    private final int N_MINES = 40;
    private final int N_ROWS = 16;
    private final int N_COLS = 16;
    private int mines_left;
    
    private final int[][] field = new int[N_ROWS][N_COLS];

    /**
     * Default constructor for objects of class Game
     */
    public Game()
    {

    }

    private void startGame() 
    {
        mines_left = N_MINES;
        
        // cover all cells
        for (int i = 0; i < N_ROWS; i++)
        {   
            for (int j = 0; j < N_COLS; j++)
            {
                field[i][j] = COVER_FOR_CELL;
            }
        }
        
        int count = 0;
        // randomly position mines throwout field, update values of cells adjacent to mine cells
        while (count < N_MINES) 
        {
            int j = (int) (N_COLS * Math.random());

            for (int i = 0; i < N_ROWS; i++)
            {
                if ((i < N_COLS) && (field[i][j] != COVERED_MINE_CELL)) 
                {
                    field[i][j] = COVERED_MINE_CELL;
                    count++;
    
                    if (i > 0) 
                    { 
                        if (field[i-1][j] != COVERED_MINE_CELL)
                        {
                            field[i-1][j] += 1;
                        }
                    }
                    
                    if (i < N_ROWS - 1)
                    {
                        if (field[i+1][j] != COVERED_MINE_CELL)
                        {
                            field[i+1][j] += 1;
                        }
                    }
                    
                    if (j > 0) 
                    { 
                        if (field[i][j-1] != COVERED_MINE_CELL)
                        {
                            field[i][j-1] += 1;
                        }
                    }
                    
                    if (j < 0) 
                    { 
                        if (field[i][j+1] != COVERED_MINE_CELL)
                        {
                            field[i][j+1] += 1;
                        }
                    }
                }
            }
        }
    }

    public void find_empty_cells(int i, int j) 
    {
        if (i > 0) 
        { 
            if (field[i-1][j] > MINE_CELL) 
            {
                field[i-1][j] -= COVER_FOR_CELL;
                
                if (field[i-1][j] == EMPTY_CELL)
                {
                    find_empty_cells(i-1, j);
                }
            }
        }
        
        if (i < N_ROWS - 1) 
        { 
            if (field[i+1][j] > MINE_CELL) 
            {
                field[i+1][j] -= COVER_FOR_CELL;
                
                if (field[i+1][j] == EMPTY_CELL)
                {
                    find_empty_cells(i+1, j);
                }
            }
        }
        
        if (j > 0) 
        { 
            if (field[i][j-1] > MINE_CELL) 
            {
                field[i][j-1] -= COVER_FOR_CELL;
                
                if (field[i][j-1] == EMPTY_CELL)
                {
                    find_empty_cells(i, j-1);
                }
            }
        }
        
        if (j < N_COLS - 1) 
        { 
            if (field[i][j+1] > MINE_CELL) 
            {
                field[i][j+1] -= COVER_FOR_CELL;
                
                if (field[i][j+1] == EMPTY_CELL)
                {
                    find_empty_cells(i, j+1);
                }
            }
        }
    }
}
