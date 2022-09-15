package by.incubator.application.writer;

import by.incubator.application.table.TableLine;

import java.util.List;

public interface TableLineWriter {
    void writeTableLines(List<TableLine> tableLines);
}
