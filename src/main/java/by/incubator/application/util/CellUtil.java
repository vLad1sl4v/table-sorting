package by.incubator.application.util;

import by.incubator.application.table.Cell;

/**
 * This class contains various methods for manipulating cells
 */
public class CellUtil {
    /**
     * Checks whether certain cell's value is a number
     *
     * @param cell cell that is to be checke
     * @return true if cell's value is a number, false if cell's number isn't number
     */
    public static boolean isNumber(Cell cell) {
        try {
            Double.parseDouble(cell.getCellString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
