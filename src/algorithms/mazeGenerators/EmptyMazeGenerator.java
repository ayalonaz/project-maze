package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator {

    public EmptyMazeGenerator() {

    }
    public Maze generate(int rows, int columns) {
        Maze emptyMaze=new Maze(rows,columns);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                emptyMaze.setValue(i,j,0);
            }
        }
    return emptyMaze;
    }


}
