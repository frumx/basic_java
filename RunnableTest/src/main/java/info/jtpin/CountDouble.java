package info.jtpin;

import java.util.List;
import static info.jtpin.Driver.*;


public class CountDouble implements Runnable {

    private static List<Double> listRef;

    private static int noIterations = 41;

    private static int size;

    private static int requestedSize;

    private static int noInstances;


    public CountDouble(List list, int newSize) {
        requestedSize = newSize;

        int currentSize;
        synchronized (list) {
            currentSize = list.size();
            listRef = list;
            noIterations = requestedSize - listRef.size();
        }

        size = currentSize;
        ++noInstances;
    }

    private void fixNoIterations() {
        synchronized (listRef) {
            int currentSize = listRef.size();
            noIterations = requestedSize - currentSize;
        }
    }

    private void sumDouble() {
        synchronized (listRef) {
            for (int currentSize = listRef.size(); currentSize < requestedSize; currentSize = listRef.size()) {
                double sum = listRef.stream().mapToDouble(Double::doubleValue).sum();
                listRef.add(sum);
                ThreadJiggler.jiggle();
            }
        }
    }

    public void run() {
        sumDouble();
    }

    public int getNoInstances() {
        return noInstances;
    }

    public static int getSize() {
        return size;
    }

}