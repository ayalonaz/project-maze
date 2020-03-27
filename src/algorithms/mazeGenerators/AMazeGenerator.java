package algorithms.mazeGenerators;

public abstract class AMazeGenerator implements IMazeGenerator {
    @Override
    public long measureAlgorithmTimeMillis(int rows, int columns) {
        long start=System.currentTimeMillis();
        Maze myMaze=generate(rows,columns);
        long end=System.currentTimeMillis();
        long timeOfMaze=end-start;
        return timeOfMaze;

    }
}
