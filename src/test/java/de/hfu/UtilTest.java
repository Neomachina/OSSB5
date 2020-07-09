package de.hfu;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {
    @Test
    public void testtheTest() {
        Util tester = new Util();

        //statements:
        assertEquals(false, tester.istErstesHalbjahr(9));
        assertEquals(true,tester.istErstesHalbjahr(3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testwhenExceptionThrown_thenExpectationSatisfied(){
        Util tester = new Util();
        tester.istErstesHalbjahr(-6);
    }
}