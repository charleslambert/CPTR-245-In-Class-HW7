/*
What information goes into an input domain model?

    The input must be larger than 1582, must be a integer.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLeapYearInputDomain {

    @Test
    public void TestIsLeapTrue() {
        assertTrue (LeapYear.isLeap(2000));
    }

    @Test
    public void TestIsLeapFalse() {
        assertFalse(LeapYear.isLeap(2001));
    }
}
