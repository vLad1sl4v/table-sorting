package by.incubator.application.writer.impl;

import by.incubator.application.table.TableLine;
import by.incubator.application.writer.TableLineWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link by.incubator.application.writer.TableLineWriter},
 * used for writing table lines to a text file
 */
public class TextFileTableLineWriter implements TableLineWriter {
    /**
     * Path of the file, which are lines read into
     */
    private final Path PATH;

    public TextFileTableLineWriter(String path) {
        PATH = Paths.get(path);
    }

    @Override
    public void writeTableLines(List<TableLine> tableLines) {
        List<String> tableLinesString = getStrings(tableLines);

        try {
            Files.write(PATH, tableLinesString, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> getStrings(List<TableLine> tableLines) {
        List<String> strings = new ArrayList<>();

        for (TableLine tableLine : tableLines) {
            strings.add(tableLine.toString());
        }

        return strings;
    }
}
