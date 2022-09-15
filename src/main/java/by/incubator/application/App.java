package by.incubator.application;

import by.incubator.application.service.TableLineService;
import by.incubator.application.table.TableLine;

import java.util.List;

public class App {
    private TableLineService service;

    public App(TableLineService service) {
        this.service = service;
    }

    public void start() {
        List<TableLine> tableLines = service.getTableLines();
        List<TableLine> sortedLines = service.sortTableLines(tableLines);
        service.writeTableLines(sortedLines);
    }
}
