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
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cells.size() - 1; i++) {
            stringBuilder.append(cells.get(i));
            stringBuilder.append("\t");
        }

        stringBuilder.append(cells.get(cells.size() - 1));

       return stringBuilder.toString();
    }
}
