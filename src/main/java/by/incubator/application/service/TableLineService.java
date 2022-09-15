package by.incubator.application.service;

import by.incubator.application.table.TableLine;

import java.util.List;

/**
 * {@code TableLineService} allows to conduct operations with lines of any tables, e.g. files or databases
 */
public interface TableLineService {
    /**
     * This method is used to sort table lines list, sort order is not specified
     *
     * @param tableLines list of lines that are to be sorted
     * @return list of sorted lines
     */
    List<TableLine> sortTableLines(List<TableLine> tableLines);

    /**
     * This method is used to get table lines from any source
     *
     * @return list of received lines
     */
    List<TableLine> getTableLines();

    /**
     * This method is used to write table lines to any source
     *
     * @param lines list of lines to be written
     */
    void writeTableLines(List<TableLine> lines);
}
