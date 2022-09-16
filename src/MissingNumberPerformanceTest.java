import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberPerformanceTest {
    private MissingNumber number = new MissingNumber();
    private int [] missingMin = {2,3,4,5};
    private int [] missingThree = {1,2,4,5};
    private int biggest = 5;

    @Test(timeout=10000)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumber(missingMin, biggest);
            number.missingNumber(missingThree, biggest);
        }
    }
    @Test(timeout=1000)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumberSort(missingMin, biggest);
            number.missingNumberSort(missingThree, biggest);

        }
    }
    @Test(timeout=1000)
    public void testMissingNumber2_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            number.missingNumber2(missingMin, biggest);
            number.missingNumber2(missingThree, biggest);

        }
    }
}