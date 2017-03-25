package info.jtpin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.currentThread;
import static java.util.Collections.synchronizedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Driver {

    private static final int DEFAULTMAXELEMS = 7;

    private static final double RANGEMIN = -1.9056;

    private static final double RANGEMAX = 8.00056;

    private static int noCores;

    private static Thread[] threadWorkers;

    private static Slf4jUser slf4juser;

    private static List<Double> listRef;

    private static Driver driverInstance;

    public static class Slf4jUser {
        public final Logger logger = LoggerFactory.getLogger(Slf4jUser.class);

        public void aMethodThatLogs() {
            logger.info("Hello World!");
        }
    }

    private static class DriverLoader {
        private static final Driver INSTANCE = new Driver();
    }

    private Driver() {
        if (DriverLoader.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
        driverInstance = this;
        noCores = Runtime.getRuntime().availableProcessors();
        slf4juser = new Slf4jUser();
        listRef = null;
    }

    public void testDriver(int THREADCOUNT, int NO_INITIALELEMS, int OUTPUTSIZE, int DELAY) {
        driverInstance = getInstance();
        fillArrayWithDouble(NO_INITIALELEMS);
        startThreads(THREADCOUNT, OUTPUTSIZE);
        try {
            Thread.sleep(DELAY);
            stopThreads(THREADCOUNT);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void startThreads(int FIXEDCORECOUNT, int OUTPUTSIZE) {

        threadWorkers = new Thread[FIXEDCORECOUNT];

        for (int i = 0; i < FIXEDCORECOUNT; ++i) {
            threadWorkers[i] = new Thread(new CountDouble(listRef, OUTPUTSIZE));
            slf4juser.logger.info(i + " runnable object instantiated");
        }
        for (int i = 0; i < FIXEDCORECOUNT; ++i) {
            threadWorkers[i].setName("[" + i + " thread]");
            threadWorkers[i].start();
            slf4juser.logger.info(threadWorkers[i].getName() + "::thread starting");
        }
    }

    public static void stopThreads(int FIXEDCORECOUNT) throws InterruptedException {
        for (int i = 0; i < FIXEDCORECOUNT; ++i) {
            threadWorkers[i].join();
            slf4juser.logger.info(threadWorkers[i].getName() + "::thread terminating");
        }
    }

    public static void fillArrayWithDouble() {
        listRef = synchronizedList(new ArrayList<Double>());
        for (int i = 0; i < DEFAULTMAXELEMS; ++i) {
            double item = 0d + ThreadLocalRandom.current().nextDouble(RANGEMIN, RANGEMAX);
            listRef.add(item);
            slf4juser.logger.info(i + " item added: " + item);
        }
    }

    public static void fillArrayWithDouble(int MAXELEMS) {
        listRef = synchronizedList(new ArrayList<Double>());
        for (int i = 0; i < MAXELEMS; ++i) {
            double item = 0d + ThreadLocalRandom.current().nextDouble(RANGEMIN, RANGEMAX);
            listRef.add(item);
            slf4juser.logger.info(i + " item added: " + item);
        }
    }

    public static Slf4jUser getSlf4juser() {
        return slf4juser;
    }

    public static List<Double> getListRef() {
        return listRef;
    }

    public static Driver getInstance() {
        return DriverLoader.INSTANCE;
    }

    public static class ThreadJiggler {
        private static final int RANGEMIN = 0;
        private static final int RANGEMAX = 2;

        public static void jiggle() {
            int picker = ThreadLocalRandom.current().nextInt(RANGEMIN, RANGEMAX);
            switch (picker) {
                case 0:
                    currentThread().yield();
                    break;
                case 1:
                    try {
                        currentThread().sleep(ThreadLocalRandom.current().nextInt(5, 25));
                    } catch (InterruptedException ex) {
                        driverInstance.getSlf4juser().logger.trace("", ex);
                        Thread.currentThread().interrupt();
                    }
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        driverInstance = getInstance();
        System.out.println(noCores);

        fillArrayWithDouble(3);
        System.out.println(listRef);
        System.out.println(listRef.size());

        startThreads(noCores, 110);
        try {
            stopThreads(noCores);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.gc();

        int testCount = noCores + 12;
        startThreads(testCount, 120);
        try {
            stopThreads(testCount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(listRef);
        System.out.println(listRef.size());


        fillArrayWithDouble();
        (new CountDouble(listRef, 125)).run();
        System.out.println(listRef);
        System.out.println(listRef.size());
    }

}






