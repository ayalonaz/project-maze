package algorithms.mazeGenerators;

import java.lang.reflect.Array;
import java.util.List;

public class Position {
    private int rowPosition;
    private int colPosition;


    public Position(int rowPosition, int colPosition) {
        this.rowPosition = rowPosition;
        this.colPosition = colPosition;
    }

    public int getRowPosition(){
        return this.rowPosition;
    }
    public int getColPosition(){
        return  this.colPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public void setColPosition(int colPosition) {
        this.colPosition = colPosition;
    }
    public Position getPosition(int rows,int columns) {
        if (rows >= 0 || columns >= 0) {
           Position thePosition = new Position(rows,columns);
            return thePosition;
        }
        return null;
    }
    public boolean legalMove(int row,int col) {
        if (row < 0 || col < 0) {
            return false;
        }
        return true;
    }

    }
