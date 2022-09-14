package by.incubator.application;

import by.incubator.application.dao.TableLineDao;
import by.incubator.application.comparator.TableLineComparator;
import by.incubator.application.dao.impl.FileTableLineDao;
import by.incubator.application.entity.TableLine;
import by.incubator.application.service.TableLineService;
import by.incubator.application.service.impl.TableLineServiceImpl;
import by.incubator.application.writer.TableLineWriter;
import by.incubator.application.writer.impl.FileTableLineWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TableLineDao fileTableLineDao = new FileTableLineDao("in.txt");
        TableLineService tableLineService = new TableLineServiceImpl(new TableLineComparator());
        TableLineWriter tableLineWriter = new FileTableLineWriter("out.txt");

        List<TableLine> tableLines = fileTableLineDao.getTableLines();
        List<TableLine> sortedLines = tableLineService.sortTableLines(tableLines);
        tableLineWriter.writeTableLines(sortedLines);
    }
}
