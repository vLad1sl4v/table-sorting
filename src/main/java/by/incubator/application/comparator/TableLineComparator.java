package by.incubator.application.comparator;

import by.incubator.application.table.Cell;
import by.incubator.application.table.TableLine;

import java.util.Comparator;
import java.util.List;

/**
 * Comparator of table lines, compares two table lines, matching to cells of each line with the same index
 */
public class TableLineComparator implements Comparator<TableLine> {
    /**
     * Compares two lines of a table, cell by cell using
     * {@link by.incubator.application.comparator.CellComparator},
     *  if one line is a part of other, then table lines are compared by their sizes
     *
     * @param o1 the first line to be compared.
     * @param o2 the second line to be compared.
     * @return a negative integer, zero, or a positive integer
     * as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(TableLine o1, TableLine o2) {
        List<Cell> firstCells = o1.getCells();
        List<Cell> secondCells = o2.getCells();

        int firstCellsNumber = firstCells.size();
        int secondCellsNumber = secondCells.size();
        int minCellsNumber = Integer.min(firstCellsNumber, secondCellsNumber);

        for (int i = 0; i < minCellsNumber; i++) {
            CellComparator cellComparator = new CellComparator();
            int cellComparisonResult = cellComparator.compare(firstCells.get(i), secondCells.get(i));

            if (cellComparisonResult != 0) {
                return cellComparisonResult;
            }
        }

        return firstCellsNumber == secondCellsNumber ? 0 :
                (minCellsNumber == firstCellsNumber ? -1 : 1);
    }
}
