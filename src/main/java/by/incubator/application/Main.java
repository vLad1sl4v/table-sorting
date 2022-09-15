package by.incubator.application;

import by.incubator.application.comparator.TableLineComparator;
import by.incubator.application.dao.TableLineRepository;
import by.incubator.application.dao.impl.FileTableLineRepository;
import by.incubator.application.reader.TableLineReader;
import by.incubator.application.reader.impl.TextFileTableLineReader;
import by.incubator.application.service.TableLineService;
import by.incubator.application.service.impl.TableLineServiceImpl;
import by.incubator.application.table.TableLine;
import by.incubator.application.writer.TableLineWriter;
import by.incubator.application.writer.impl.TextFileTableLineWriter;

import java.util.Comparator;

public class Main {
    private static final String IN_PATH = "in.txt";
    private static final String OUT_PATH = "out.txt";

    public static void main(String[] args) {
        System.out.println("Configuring application... ");
        App app = configureApplication();

        System.out.println("Starting application... ");
        app.start();
        System.out.println("Table was successfully sorted and written in file: " + OUT_PATH);
    }

    private static App configureApplication() {
        TableLineReader reader = new TextFileTableLineReader(IN_PATH);
        TableLineWriter writer = new TextFileTableLineWriter(OUT_PATH);
        TableLineRepository repository = new FileTableLineRepository(writer, reader);
        Comparator<TableLine> comparator = new TableLineComparator();
        TableLineService service = new TableLineServiceImpl(comparator, repository);

        return new App(service);
    }
}
