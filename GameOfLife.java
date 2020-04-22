public class GameOfLife {

    //Object Variables

    int size;
    int[][] board;
    int[][] previous;

    //Constructors

    public GameOfLife() {

        this.size = 10;
        board = new int[10][10];
        previous = new int[10][10];

        int i = 0;
        int j = 0;

        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[i].length; j++){

                board[i][j] = 0;
                previous[i][j] = 0;

            }
        }

    }

    public GameOfLife(int size){

        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];

        int i = 0;
        int j = 0;

        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[i].length; j++){

                board[i][j] = 0;
                previous[i][j] = 0;

            }
        }

    }

    public GameOfLife(int[][] x){

        int i = 0;
        int j = 0;

        previous = new int[x.length][x.length];
        board = new int[x.length][x.length];

        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {

                previous[i][j] = x[i][j];
                board[i][j] = x[i][j];

            }
        }
    }


    //Methods

    public void printBoard () {

        int i = 0;
        int j = 0;

        for (i = 0; i < this.board.length; i++) {
            for (j = 0; j < this.board[i].length; j++) {

                if(board[i][j] == 0)
                    System.out.print(" . ");

                else
                    System.out.print(" 0 ");

            }

            System.out.println();

        }
    }

    public void addCells(int i, int j){

        //Checks for invalid index

        if(i > board.length || i < 0 || j > board.length || j < 0)
            System.out.println("Invalid Index");

        //Else adds cell

        else {
            previous[i][j] = 1;
            board[i][j] = 1;
        }
    }

    public int[][] getBoard () {

        return board;

    }

    public void oneStep () {

        int i = 0;
        int j = 0;
        int numNeighbors = 0;

        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[i].length; j++){

                numNeighbors = neighbors(i,j);

                if(previous[i][j] == 1 && numNeighbors < 2)
                    board[i][j] = 0;

                if(previous[i][j] == 1 && (numNeighbors == 2 || numNeighbors == 3))
                    board[i][j] = 1;

                if(previous[i][j] == 1 && numNeighbors > 3)
                    board[i][j] = 0;

                if(previous[i][j] == 0 && numNeighbors == 3)
                    board[i][j] = 1;

            }
        }

        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[i].length; j++){

                previous[i][j] = board[i][j];

            }
        }

    }

    public int neighbors (int i, int j) {

        int count = 0;

        //Checks for invalid index first

        if (i > previous.length || i < 0 || j > previous.length || j < 0) {

            System.out.print("Invalid index, out of bounds");
            return count;

        }

        //Checks to see if index is in "safe zone"

        if(i > 0 && i < (previous.length - 1) && j > 0 && j < (previous.length - 1)){

            if(previous[i-1][j-1] == 1)
                count++;

            if(previous[i-1][j] == 1)
                count++;

            if(previous[i-1][j +1] == 1)
                count++;

            if(previous[i][j-1] == 1)
                count++;

            if(previous[i][j+1] == 1)
                count++;

            if(previous[i+1][j-1] == 1)
                count++;

            if(previous[i+1][j] == 1)
                count++;

            if(previous[i+1][j+1] == 1)
                count++;

            return count;

        }

        //If index not in "safe zone" then start checking for other stuff

        else{

            //If cell to check is in top left corner

            if(i == 0 && j == 0){

                if (previous[i][j + 1] == 1)
                    count++;

                if (previous[i + 1][j] == 1)
                    count++;

                if (previous[i + 1][j + 1] == 1)
                    count++;

            }

            //If cell is in top row but not a corner

            if(i == 0 && j > 0 && j < (previous[i].length - 1)){

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

                if(previous[i+1][j-1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

                if(previous[i+1][j+1] == 1)
                    count++;

            }

            //If cell is in top right corner

            if(i == 0 && j == (previous[i].length - 1)){

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i+1][j-1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

            }

            //If cell is in bottom left corner

            if(i == (previous.length - 1) && j == 0){

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][j +1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

            }

            //If cell is in bottom row but not a corner

            if(i == (previous.length - 1) && j > 0 && j < (previous[i].length - 1)){

                if(previous[i-1][j-1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][j +1] == 1)
                    count++;

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

            }

            //If cell is in bottom right corner

            if(i == (previous.length - 1) && j == (previous[i].length -1)){

                if(previous[i-1][j-1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i][j-1] == 1)
                    count++;

            }

            //If cell is in left most column

            if(j == 0 && i > 0 && i < (previous.length - 1)){

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][j +1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

                if(previous[i+1][j+1] == 1)
                    count++;

            }

            //If cell is in right most column

            if(j == (previous[i].length - 1) && i > 0 && i < (previous.length - 1)){

                if(previous[i-1][j-1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i+1][j-1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

            }

        }

        return count;

    }

    public void evolution(int n){

        int i = 0;

        for(i = 0; i < n; i++){

            oneStep();

        }
    }

}
