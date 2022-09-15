package by.incubator.application.writer;

import by.incubator.application.table.TableLine;

import java.util.List;

/**
 * {@code TableLineWriter} allows to write lines of a table to any file
 */
public interface TableLineWriter {
    /**
     * This method is used to write table lines into a file
     *
     * @param tableLines lines to be written into a file
     */
    void writeTableLines(List<TableLine> tableLines);
}
