package by.incubator.application.entity;

public class Cell {
    private String cellString;

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

    public boolean containsNumber() {
        for (int i = 0; i < cellString.length(); i++) {
            if (Character.isDigit(cellString.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return getCellString();
    }
}
