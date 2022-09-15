package by.incubator.application.dao;

import by.incubator.application.table.TableLine;

import java.util.List;

/**
 * {@code TableLineRepository} allows to write and get table lines from any source, e.g. files, databases
 */
public interface TableLineRepository {
    /**
     * This method is used to get table lines from any source
     *
     * @return list of received lines
     */
    List<TableLine> getAllLines();

    /**
     * This method is used to write table lines to any source
     *
     * @param lines list of lines tom be written
     */
    void writeAllLines(List<TableLine> lines);
}
