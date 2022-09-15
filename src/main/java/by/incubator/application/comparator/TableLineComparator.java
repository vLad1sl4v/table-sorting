package by.incubator.application.comparator;

import by.incubator.application.table.Cell;
import by.incubator.application.table.TableLine;

import java.util.Comparator;
import java.util.List;

public class TableLineComparator implements Comparator<TableLine> {
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
