package algorithms.mazeGenerators;

public class SimpleMazeGenerator extends AMazeGenerator {

    public SimpleMazeGenerator() {
    }

    @Override
    public Maze generate(int rows, int columns) {
        Maze randomMaze=new Maze(rows, columns);
        new random().nextBytes(randomMaze.getMazeArray());
        return  randomMaze;
    }


}
