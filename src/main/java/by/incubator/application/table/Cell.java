package by.incubator.application.table;

/**
 * Represents a table cell, being a part of a table line {@link  by.incubator.application.table.TableLine}.
 *
 * <p>{@code Cell} is used to be a component of table line</>
 */
public class Cell {
    /**
     * String value of a cell
     */
    private final String cellString;

    /**
     * @param cellString string value of a cell
     */
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
