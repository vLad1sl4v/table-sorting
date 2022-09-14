package by.incubator.application.dao.impl;

import by.incubator.application.dao.TableLineDao;
import by.incubator.application.entity.Cell;
import by.incubator.application.entity.TableLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileTableLineDao implements TableLineDao {
    private final static String SEPARATOR = "\t";
    private final Path PATH;

    public FileTableLineDao(String path) {
        PATH = Paths.get(path);
    }

    @Override
    public List<TableLine> getTableLines() {
        List<String> lines;
        List<TableLine> tableLines;

        try {
            lines = Files.readAllLines(PATH);
            tableLines = getCellLines(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return tableLines;
    }

    private List<TableLine> getCellLines(List<String> lines) {
        List<TableLine> tableLines = new ArrayList<>();

        for (String str : lines) {
            List<String> cells = Arrays.asList(str.split(SEPARATOR));
            tableLines.add(new TableLine(cells));
        }

        return tableLines;

    }
}
