package algorithms.mazeGenerators;

public class SimpleMazeGenerator extends AMazeGenerator {

    public SimpleMazeGenerator() {
    }


    public Maze generate(int rows, int columns) {
        Maze randomMaze = new Maze(rows, columns);

        int max = 1;
        int min = 0;
        int range = max - min + 1;
        int range1 = columns;
        int range2 = rows;
        int begin = (int) (Math.random() * range1);
        Position randomStart = new Position(0, begin);
        randomMaze.setStartPosition(randomStart);
        int end = (int) (Math.random() * range2);
        Position randomEnd = new Position(rows - 1, end);
        randomMaze.setGoalPosition(randomEnd);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int random = (int) (Math.random() * range) + min;
                randomMaze.setValue(i, j, random);
            }
        }
        if (begin > end) {
            for (i = 0; i < columns; i++) {
                randomMaze.setValue(i, begin, 0);

            }
            for (i = begin; i >= end; i--) {
                randomMaze.setValue(rows - 1, i, 0);
            }
        }
        if (begin < end) {
            for (i = 0; i < columns; i++) {
                randomMaze.setValue(i, begin, 0);
            }
            for (i = begin; i < end; i++) {
                randomMaze.setValue(rows - 1, i, 0);
            }


        }
        return randomMaze;
    }
}