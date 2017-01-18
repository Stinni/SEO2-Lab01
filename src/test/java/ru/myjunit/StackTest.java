package ru.myjunit;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 18.01.17
 */
public class StackTest {

    @Test
    public void testMakeEmpty() {
        Stack testStack = new StackImpl();
        testStack.push(new Integer(3));
        testStack.push(new Integer(4));
        testStack.makeEmpty();
        assertEquals(0, testStack.size());
    }
}
