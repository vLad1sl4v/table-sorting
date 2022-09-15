package by.incubator.application.dao;

import by.incubator.application.table.TableLine;

import java.util.List;

public interface TableLineRepository {
    List<TableLine> getAllLines();
    void writeAllLines(List<TableLine> lines);
}
