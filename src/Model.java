import java.awt.Color;
import java.util.ArrayList;

public class Model {

    private int[][] grid; //board grid where 1 for black , 0 for white and -1 empty
    private int turn;  // (turn%2) gives us whose turn it is currently
    private ArrayList<View> listOfViews; //to store views

    public Model() {
        //initialize the grid
        reset();

        //initialize listOfViews
        listOfViews = new ArrayList<>();
    }


    public int getTurn() {
        //if current player don't have any move available we have to skip this turn and move to next one
        if (!hasMove(turn % 2)) {
            turn++;
        }

        //returning whose turn it is now e.g, 0th,2nd,4th.... are white turns and likewise odd turns are black's turn
        return turn % 2;
    }

    public void storeView(View view) {
        //storing view to list
        listOfViews.add(view);
    }

    public void updateAllViews() {
        //updating all the view we have stored in list
        for (int i = 0; i < listOfViews.size(); i++) {
            listOfViews.get(i).update();
        }
    }

    // For AI moves, this method calculate the best move available move and take turn
    public void bestMove(int player) {
        int r = 0, c = 0, best = 0;

        //traversing throughout the grid and searching for best move , in terms of number of piece capture
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int count = captureCount(player, i, j);
                if (count > best) {
                    best = count;
                    r = i;
                    c = j;
                }
            }
        }

        //take the best turn available
        takeTurn(player, r, c);
    }

    // A square is empty if equals -1
    public boolean isEmpty(int i, int j) {
        return grid[i][j] == -1;
    }

    //This method return color for (i,j)'th square in the grid in terms of there state
    public Color getColor(int i, int j) {
        if (grid[i][j] == -1) {
            // if -1 it is empty, means same color as background
            return Color.GREEN;
        } else if (grid[i][j] == 0) {
            // 0 means white
            return Color.WHITE;
        } else {
            // 1 means black
            return Color.BLACK;
        }
    }

    //This is a helper method to count out how many pieces we can capture for a move
    private int captureCount(int player, int row, int col) {
        //not empty we can't make a move here so zero capture
        if (!isEmpty(row,col)) {
            return 0;
        }

        int count = 0;

        //temporary making the move to count
        grid[row][col] = player;

        //count for 8 different direction
        count += countInDirection(row, col, player, 0, -1);
        count += countInDirection(row, col, player, 0, 1);
        count += countInDirection(row, col, player, 1, 0);
        count += countInDirection(row, col, player, -1, 0);
        count += countInDirection(row, col, player, 1, 1);
        count += countInDirection(row, col, player, 1, -1);
        count += countInDirection(row, col, player, -1, 1);
        count += countInDirection(row, col, player, -1, -1);

        //undo the mode
        grid[row][col] = -1;

        return count;
    }

    //This method take the turn and capture by changing the states of the grid
    public void takeTurn(int player, int row, int col) {

        //take the turn
        grid[row][col] = player;

        //capturing pieces in 8 different direction
        direction(row, col, player, 0, -1);
        direction(row, col, player, 0, 1);
        direction(row, col, player, 1, 0);
        direction(row, col, player, -1, 0);
        direction(row, col, player, 1, 1);
        direction(row, col, player, 1, -1);
        direction(row, col, player, -1, 1);
        direction(row, col, player, -1, -1);

        //time to move to next turn
        turn++;
        //front-end must also change accordingly
        updateAllViews();
    }

    //helper method to count possible capture in a specific direction
    private int countInDirection(int row, int column, int colour, int colDir, int rowDir) {
        //moving to the next possible position in the specified direction
        int currentRow = row + rowDir;
        int currentCol = column + colDir;

        //invalid possible means no capture
        if (currentRow == 8 || currentRow < 0 || currentCol == 8 || currentCol < 0) {
            return 0;
        }

        int count = 0;

        //If you find an empty square or the edge of the board then stop – no pieces can be captured in that direction.
        //If you find a piece of the opposing colour then continue in that direction and check the next square.
        //If you find a piece of your own colour then stop and capture all of the pieces of the opposing colour
        //          between it and the piece you just played. If no opposing pieces would be captured then you cannot play there.
        while (grid[currentRow][currentCol] == 1 || grid[currentRow][currentCol] == 0) {
            if (grid[currentRow][currentCol] == colour) {
                while (!(row == currentRow && column == currentCol)) {
                    count++;
                    currentRow = currentRow - rowDir;
                    currentCol = currentCol - colDir;
                }
                count--;
                break;
            } else {
                currentRow = currentRow + rowDir;
                currentCol = currentCol + colDir;
            }
            if (currentRow < 0 || currentCol < 0 || currentRow == 8 || currentCol == 8) {
                break;
            }
        }

        return count;
    }

    //helper method to capture pieces in a specific direction
    private void direction(int row, int column, int player, int colDir, int rowDir) {
        //moving to the next possible position in the specified direction
        int currentRow = row + rowDir;
        int currentCol = column + colDir;

        //invalid possible means no capture
        if (currentRow == 8 || currentRow < 0 || currentCol == 8 || currentCol < 0) {
            return;
        }


        //If you find an empty square or the edge of the board then stop – no pieces can be captured in that direction.
        //If you find a piece of the opposing colour then continue in that direction and check the next square.
        //If you find a piece of your own colour then stop and capture all of the pieces of the opposing colour
        //          between it and the piece you just played. If no opposing pieces would be captured then you cannot play there.
        while (grid[currentRow][currentCol] == 1 || grid[currentRow][currentCol] == 0) {
            if (grid[currentRow][currentCol] == player) {
                while (!(row == currentRow && column == currentCol)) {
                    grid[currentRow][currentCol] = player;
                    currentRow = currentRow - rowDir;
                    currentCol = currentCol - colDir;
                }
                break;
            } else {
                currentRow = currentRow + rowDir;
                currentCol = currentCol + colDir;
            }
            if (currentRow < 0 || currentCol < 0 || currentRow == 8 || currentCol == 8) {
                break;
            }
        }
    }

    //Gives a player move is valid or not
    public boolean validMove(int player, int row, int col) {
        // empty and capture at least one pieces means valid move
        return isEmpty(row, col) && captureCount(player, row, col) > 0;
    }

    //Gives a player has any valid move or not
    public boolean hasMove(int player) {
        //traverses the grid a check is there valid move or not for the specified player
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (validMove(player, i, j)) {
                    //valid move found return true
                    return true;
                }
            }
        }

        //no valid move found return false
        return false;
    }

    //Gives as the game result
    public String result() {

        //counting who gets how much
        int black = 0, white = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] == 1) black++;
                if (grid[i][j] == 0) white++;
            }
        }

        //retuning result according to the counting result
        if (black > white) {
            return "Black wins: " + white + ":" + black;
        } else if (black < white) {
            return "White wins: " + white + ":" + black;
        } else {
            return "Draw: " + white + ":" + black;
        }
    }

    //this method make everything new
    public void reset() {
        grid = new int[8][8];

        //fill up with empty
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                grid[i][j] = -1;
            }
        }

        //four position in the middle of the board fill up in the beginning
        grid[3][3] = 0;
        grid[3][4] = 1;
        grid[4][3] = 1;
        grid[4][4] = 0;

        //turn staring again
        turn = 0;
    }
}
