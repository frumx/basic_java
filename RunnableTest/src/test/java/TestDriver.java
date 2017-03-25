import info.jtpin.Driver;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by mdcow on 24.03.17.
 */
public class TestDriver {

    static Driver driverInstance = Driver.getInstance();

    @Test
    public void testOneThread() {
        long startTime = System.nanoTime();
        // THREADCOUNT, INITIAL_ELEMS, OUTPUTSIZE, DELAY_MS
        driverInstance.testDriver(1, 3, 13, 0);
        assertEquals(13, driverInstance.getListRef().size());

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        driverInstance.getSlf4juser().logger.info("Test took: " + String.valueOf(duration / 1_000_000) + "ms");
    }

    @Test
    public void testManyThreads() {
        long startTime = System.nanoTime();
        // THREADCOUNT, INITIAL_ELEMS, OUTPUTSIZE, DELAY_MS
        driverInstance.testDriver(12 + 24, 13, 213, 0);
        assertEquals(213, driverInstance.getListRef().size());

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        driverInstance.getSlf4juser().logger.info("Test took: " + String.valueOf(duration / 1_000_000) + "ms");
    }

    @Test
    public void testXThreads() {
        long startTime = System.nanoTime();
        // THREADCOUNT, INITIAL_ELEMS, OUTPUTSIZE, DELAY_MS
        driverInstance.testDriver(13, 113, 213, 500);
        assertEquals(213, driverInstance.getListRef().size());

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        driverInstance.getSlf4juser().logger.info("Test took: " + String.valueOf(duration / 1_000_000) + "ms");
    }

}
