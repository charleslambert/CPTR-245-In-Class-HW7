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
    public void testIsLeap() {
        assertTrue(LeapYear.isLeap(2004));
        assertTrue(LeapYear.isLeap(2000));
        assertFalse(LeapYear.isLeap(2300));
        assertFalse(LeapYear.isLeap(2049));
    }
}
