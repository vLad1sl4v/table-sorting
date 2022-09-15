package by.incubator.application.table;

public class Cell {
    private final String cellString;

    public Cell(String cellString) {
        this.cellString = cellString;
    }

    public String getCellString() {
        return cellString;
    }

    public boolean isNumber() {
        try {
            Double.parseDouble(cellString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String toString() {
        return getCellString();
    }
}
