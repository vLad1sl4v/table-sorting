package by.incubator.application.table;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a table line, that is divided by columns into cells, {@link  by.incubator.application.table.Cell}.
 *
 * <p>{@code TableLine} can be used to store lines with information from amy source, including files, databases, etc.</p>
 */
public class TableLine {
    /**
     * Cells, which the line consists of.
     */
    private final List<Cell> cells;

    /**
     * Constructor, uses {@code String} values of every cell to create a {@code Cell} objects,
     * filling it in the {@code List<Cell>}.
     *
     * @param cells list of cells, which are the values of every cell in certain table line
     */
    public TableLine(List<String> cells) {
        this.cells = new ArrayList<>();

        for (String cellString : cells) {
            this.cells.add(new Cell(cellString));
        }
    }

    public List<Cell> getCells() {
        return cells;
    }

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
