package by.incubator.application.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableLine {
    //private String stringLine;
    private List<Cell> cells;

//    public TableLine(String stringLine) {
//        this.stringLine = stringLine;
//    }

    public TableLine(List<String> cells) {
        this.cells = new ArrayList<>();

        for (String cellString : cells) {
            this.cells.add(new Cell(cellString));
        }
    }

    public List<Cell> getCells() {
        return cells;
    }

//    public String getStringLine() {
//        return stringLine;
//    }

    @Override
    public String toString() {
        return cells.toString();
    }
}
