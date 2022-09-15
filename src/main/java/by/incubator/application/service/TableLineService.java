package by.incubator.application.service;

import by.incubator.application.table.TableLine;

import java.util.List;

public interface TableLineService {
    List<TableLine> sortTableLines(List<TableLine> tableLines);
    List<TableLine> getTableLines();
    void writeTableLines(List<TableLine> lines);
}
