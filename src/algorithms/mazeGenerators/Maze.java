package algorithms.mazeGenerators;

public class Maze {
    private int[][] MazeArray;
    private int rows;
    private int column;
    private Position StartPosition;
    private Position GoalPosition;
    public Maze(int rows, int columns) {
        this.rows = rows;
        this.column= columns;
        this.MazeArray=new int[rows][columns];
        this.StartPosition=new Position(0,0);
        this.GoalPosition=new Position(rows-1,columns-1);
    }

    public void setStartPosition(Position startPosition) {
        StartPosition = startPosition;
    }

    public void setGoalPosition(Position goalPosition) {
        GoalPosition = goalPosition;
    }

    public Position getStartPosition(int rows,int column) {


    }

    public Position getGoalPosition() {
        return GoalPosition;
    }

    public int getRows(){
        return this.rows;
    }
    public int getColumn(){
        return this.column;
    }

    public int[][] getMazeArray() {
        return MazeArray;
    }
    public int getValue(int rows,int column) {
        if (rows > 0 || column > 0) {
            return MazeArray[rows][column];
        }
        return 0;
    }
        public void setValue(int rows,int column,int i) {
            if (rows > 0 || column > 0) {
                MazeArray[rows][column] = i;
            }
        }
      public boolean legalMove(int row,int col){
         if(row<0||col<0) {
             return false;
         }
         return true;
    }

        }




