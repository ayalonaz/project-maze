package algorithms.mazeGenerators;

public class Maze {
    private int[][] MazeArray;
    private int rows;
    private int column;
    private Position StartPosition;
    private Position GoalPosition;

    public Maze(int rows, int columns) {
        this.rows = rows;
        this.column = columns;
        this.MazeArray = new int[rows][columns];
        this.StartPosition = new Position(0, 0);
        this.GoalPosition = new Position(rows - 1, columns - 1);
    }

    public void setStartPosition(Position start) {
        if (start.legalMove(start.getRowPosition(), start.getColPosition())) {
            StartPosition = start;
        }
    }

    public void setGoalPosition(Position goal) {
        if (goal.legalMove(goal.getRowPosition(), goal.getColPosition())) {
            GoalPosition = goal;
        }
    }

    public Position getStartPosition() {
        if (rows >= 0 || column >= 0) {
            return this.StartPosition;
        }
        return null;
    }

    public Position getGoalPosition() {
        if (rows >= 0 || column >= 0){
            return GoalPosition;
    }
        return null;
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
        public  void print(){

        }


}




