package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator {

    public EmptyMazeGenerator() {

    }
    public Maze generate(int rows, int columns) {
        Maze myMaze=new Maze(rows,columns);
        return myMaze;
    }


}
