package by.incubator.application.service;

import by.incubator.application.entity.TableLine;

import java.util.List;

public interface TableLineService {
    List<TableLine> sortTableLines(List<TableLine> tableLines);
}
