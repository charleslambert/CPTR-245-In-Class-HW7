/*
What does the graph model for this function look like?
                  +-------+
                 T|       |
    +-------------+       |
    |             |       |
    |             +-------+
    |                 |F
    |                 |
+---v---+         +---v---+
| Return|         |       |T
| False |         |       +----+
|       |         |       |    |
+---^---+         +-------+    |
    |                 |F       |
    |                 |        |
    |             +---v---+    |
    |            T|       |    |
    +-------------+       |    |
                  |       |    |
                  +-------+    |
                      |F       |
                      |        |
                  +---v---+    |
                  | Return|    |
                  | True  <----+
                  |       |
                  +-------+
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLeapYearGraph {

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
