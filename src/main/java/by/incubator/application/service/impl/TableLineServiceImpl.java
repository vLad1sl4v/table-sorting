package by.incubator.application.service.impl;

import by.incubator.application.dao.TableLineRepository;
import by.incubator.application.table.TableLine;
import by.incubator.application.service.TableLineService;

import java.util.Comparator;
import java.util.List;

/**
 * Implementation of {@link by.incubator.application.service.TableLineService}
 */
public class TableLineServiceImpl implements TableLineService {
    /**
     * Comparator for table lines, used to sort a list of table lines
     */
    private final Comparator<TableLine> tableLineComparator;

    /**
     * Repository of Table lines, used for getting table lines from certain source,
     * writing table lines to a certain source
     */
    private final TableLineRepository repository;

    public TableLineServiceImpl(Comparator<TableLine> tableLineComparator, TableLineRepository repository) {
        this.tableLineComparator = tableLineComparator;
        this.repository = repository;
    }

    @Override
    public List<TableLine> sortTableLines(List<TableLine> tableLines) {
        tableLines.sort(tableLineComparator);
        return tableLines;
    }

    @Override
    public List<TableLine> getTableLines() {
        return repository.getAllLines();
    }

    @Override
    public void writeTableLines(List<TableLine> lines) {
        repository.writeAllLines(lines);
    }
}
