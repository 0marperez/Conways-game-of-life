public class TorusGameOfLife extends GameOfLife{

    //Constructors

    public TorusGameOfLife() {

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

    public TorusGameOfLife(int size){

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

    public TorusGameOfLife(int[][] x){

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

    //Overridden neighbors method

    public int neighbors(int i, int j){

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

                if(previous[board.length - 1][board[i].length-1] == 1)
                    count++;

                if(previous[board.length-1][j] == 1)
                    count++;

                if(previous[board.length-1][j +1] == 1)
                    count++;

                if(previous[i][board[i].length -1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

                if(previous[i+1][board[i].length - 1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

                if(previous[i+1][j+1] == 1)
                    count++;


            }

            //If cell is in top row but not a corner

            if(i == 0 && j > 0 && j < (previous[i].length - 1)){

                if(previous[board.length-1][j-1] == 1)
                    count++;

                if(previous[board.length-1][j] == 1)
                    count++;

                if(previous[board.length-1][j +1] == 1)
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


            }

            //If cell is in top right corner

            if(i == 0 && j == (previous[i].length - 1)){

                if(previous[board.length-1][j-1] == 1)
                    count++;

                if(previous[board.length-1][j] == 1)
                    count++;

                if(previous[board.length-1][0] == 1)
                    count++;

                if(previous[i][0] == 1)
                    count++;

                if(previous[i][0] == 1)
                    count++;

                if(previous[i+1][j-1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

                if(previous[i+1][0] == 1)
                    count++;


            }

            //If cell is in bottom left corner

            if(i == (previous.length - 1) && j == 0){

                if(previous[i-1][board[i].length - 1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][j +1] == 1)
                    count++;

                if(previous[i][board[i].length -1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

                if(previous[board.length -1][board[i].length-1] == 1)
                    count++;

                if(previous[0][j] == 1)
                    count++;

                if(previous[0][j+1] == 1)
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

                if(previous[0][j-1] == 1)
                    count++;

                if(previous[0][j] == 1)
                    count++;

                if(previous[0][j+1] == 1)
                    count++;


            }

            //If cell is in bottom right corner

            if(i == (previous.length - 1) && j == (previous[i].length -1)){

                if(previous[i-1][j-1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][0] == 1)
                    count++;

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i][0] == 1)
                    count++;

                if(previous[0][j-1] == 1)
                    count++;

                if(previous[0][j] == 1)
                    count++;

                if(previous[0][0] == 1)
                    count++;


            }

            //If cell is in left most column

            if(j == 0 && i > 0 && i < (previous.length - 1)){

                if(previous[i-1][board[i].length -1] == 1)
                    count++;

                if(previous[i-1][j] == 1)
                    count++;

                if(previous[i-1][j +1] == 1)
                    count++;

                if(previous[i][board[i].length -1] == 1)
                    count++;

                if(previous[i][j+1] == 1)
                    count++;

                if(previous[i+1][board[i].length -1] == 1)
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

                if(previous[i-1][0] == 1)
                    count++;

                if(previous[i][j-1] == 1)
                    count++;

                if(previous[i][0] == 1)
                    count++;

                if(previous[i+1][j-1] == 1)
                    count++;

                if(previous[i+1][j] == 1)
                    count++;

                if(previous[i+1][0] == 1)
                    count++;

            }

        }

        return count;

    }

}
