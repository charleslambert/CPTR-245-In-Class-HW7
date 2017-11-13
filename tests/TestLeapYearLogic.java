/*
What does a logic model for this function look like?

    It looks like a set of boolean logic statements.

What aspect of this program makes this model weak?

    The program returns returns a value by default.

Is there a refactored program where the logic model is stronger?

    Yes, change the last if statement to an if else that includes the final return.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLeapYearLogic {

    @Test
    public void testIsLeap1() {
        assertTrue(LeapYear.isLeap(2004));
    }


    @Test
    public void testIsLeap2() {
        assertTrue(LeapYear.isLeap(2000));
    }

    @Test
    public void testIsLeap3() {
        assertFalse(LeapYear.isLeap(2300));
    }

    @Test
    public void testIsLeap4() {
        assertFalse(LeapYear.isLeap(2049));
    }
}
