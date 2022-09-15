package by.incubator.application.dao.impl;

import by.incubator.application.dao.TableLineRepository;
import by.incubator.application.reader.TableLineReader;
import by.incubator.application.table.TableLine;
import by.incubator.application.writer.TableLineWriter;

import java.util.List;

/**
 * Implementation of {@link by.incubator.application.dao.TableLineRepository},
 * used for writing table lines into a file, getting table lines from a file.
 */
public class FileTableLineRepository implements TableLineRepository {
    /**
     * Writer for table lines
     */
    private final TableLineWriter writer;

    /**
     * Reader of table lines
     */
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
