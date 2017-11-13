/*
What does a syntax model for this function look like?

    The syntax is made up of all syntactic statements in the code from defining a return of true
    to the modulus comparison statements.

How does the syntax model account for the weakness of the logic model?

    The syntax model covers the returned true and all other syntactic statements in the source code.

 */
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLeapYearSyntax {

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
