package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.List;

public class MyMazeGenerator extends AMazeGenerator {

    public Maze generate(int rows, int columns) {
    Maze theMaze=new Maze(rows,columns);
    for(int i=0;i<rows;i++){
        for (int j=0;j<columns;j++){
            theMaze.setValue(i,j,1);
        }
        Position start=theMaze.getStartPosition();
        List<Position> listOfWalls=new ArrayList<>();


    }



    }





}
