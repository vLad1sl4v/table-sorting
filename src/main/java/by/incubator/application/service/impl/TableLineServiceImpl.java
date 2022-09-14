package by.incubator.application.service.impl;

import by.incubator.application.entity.TableLine;
import by.incubator.application.service.TableLineService;

import java.util.Comparator;
import java.util.List;

public class TableLineServiceImpl implements TableLineService {
    private Comparator<TableLine> tableLineComparator;

    public TableLineServiceImpl(Comparator<TableLine> tableLineComparator) {
        this.tableLineComparator = tableLineComparator;
    }

    public Comparator<TableLine> getTableLineComparator() {
        return tableLineComparator;
    }

    public void setTableLineComparator(Comparator<TableLine> tableLineComparator) {
        this.tableLineComparator = tableLineComparator;
    }

    @Override
    public List<TableLine> sortTableLines(List<TableLine> tableLines) {
        tableLines.sort(tableLineComparator);
        return tableLines;
    }
}
