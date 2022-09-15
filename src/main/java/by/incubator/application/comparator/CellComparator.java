package by.incubator.application.comparator;

import by.incubator.application.table.Cell;
import by.incubator.application.util.CellUtil;

import java.util.Comparator;

/**
 * Comparator of table cells, compares two table cells
 */
public class CellComparator implements Comparator<Cell> {
    /**
     * Compares two cells:
     * if both cells values are number, then compares by values
     * if only one cell is a number, then this cell is less than another
     * if both cells are not numbers, then these cells are compared due to lexicographical order
     *
     * @param o1 the first cell to be compared.
     * @param o2 the second cell to be compared.
     * @return a negative integer, zero, or a positive integer
     * as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Cell o1, Cell o2) {
        if (CellUtil.isNumber(o1) && CellUtil.isNumber(o2)) {
            double num1 = Double.parseDouble(o1.getCellString());
            double num2 = Double.parseDouble(o2.getCellString());

            return Double.compare(num1, num2);
        } else if (CellUtil.isNumber(o1)) {
            return -1;
        } else if (CellUtil.isNumber(o2)) {
            return 1;
        } else{
            String str1 = o1.getCellString();
            String str2 = o2.getCellString();

            return str1.compareTo(str2);
        }
    }
}
