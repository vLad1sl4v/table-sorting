package by.incubator.application.service.impl;

import by.incubator.application.dao.TableLineRepository;
import by.incubator.application.table.TableLine;
import by.incubator.application.service.TableLineService;

import java.util.Comparator;
import java.util.List;

public class TableLineServiceImpl implements TableLineService {
    private final Comparator<TableLine> tableLineComparator;
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
