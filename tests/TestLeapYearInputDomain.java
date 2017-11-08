import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
