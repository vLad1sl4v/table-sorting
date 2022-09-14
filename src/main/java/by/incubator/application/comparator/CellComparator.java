package by.incubator.application.comparator;

import by.incubator.application.entity.Cell;

import java.util.Comparator;

public class CellComparator implements Comparator<Cell> {
    @Override
    public int compare(Cell o1, Cell o2) {
        if (o1.isNumber() && o2.isNumber()) {
            double num1 = Double.parseDouble(o1.getCellString());
            double num2 = Double.parseDouble(o2.getCellString());

            return Double.compare(num1, num2);
        } else if (o1.isNumber()) {
            return -1;
        } else if (o2.isNumber()) {
            return 1;
        } else{
            String str1 = o1.getCellString();
            String str2 = o2.getCellString();

            return str1.compareTo(str2);
        }
    }
}
