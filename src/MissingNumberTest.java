import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    private MissingNumber number = new MissingNumber();
    private int [] missingMin = {2,3,4,5};
    private int [] missingThree = {1,2,4,5};

    @Test
    public void testMissingNumber_MissingMin(){
        assertEquals(1, number.missingNumber(missingMin, 5));
    }

    @Test
    public void testMissingNumber_MissingThree(){
        assertEquals(3, number.missingNumber(missingThree,5));
    }
}