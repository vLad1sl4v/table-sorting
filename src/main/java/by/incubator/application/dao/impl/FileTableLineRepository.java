package by.incubator.application.dao.impl;

import by.incubator.application.dao.TableLineRepository;
import by.incubator.application.reader.TableLineReader;
import by.incubator.application.table.TableLine;
import by.incubator.application.writer.TableLineWriter;

import java.util.List;

public class FileTableLineRepository implements TableLineRepository {
    private final TableLineWriter writer;
    private final TableLineReader reader;

    public FileTableLineRepository(TableLineWriter writer, TableLineReader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public List<TableLine> getAllLines() {
        return reader.getTableLines();
    }

    @Override
    public void writeAllLines(List<TableLine> lines) {
        writer.writeTableLines(lines);
    }
}
