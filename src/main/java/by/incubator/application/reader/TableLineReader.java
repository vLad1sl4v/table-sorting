package by.incubator.application.reader;

import by.incubator.application.table.TableLine;

import java.util.List;

/**
 * {@code TableLineReader} allows to get lines of a table from any file
 */
public interface TableLineReader {
    /**
     * This method is used to get table lines from a file
     *
     * @return list of received lines
     */
    List<TableLine> getTableLines();
}
