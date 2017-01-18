package ru.myjunit;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.Iterator;

/**
 * Software Engineering 2 - Spring 2017
 * Reykjavík University
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 18.01.17
 */
public class StackTest {

    private Stack testStack;

    @Before
    public void setUp()
    {
        testStack = new StackImpl();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(testStack.isEmpty());
        testStack.push(new Integer(3));
        assertFalse(testStack.isEmpty());
    }

    @Test
    public void testMakeEmpty() {
        testStack.push(new Integer(3));
        testStack.push(new Integer(4));
        testStack.makeEmpty();
        assertEquals(0, testStack.size());
    }

    @Test
    public void testPop() {
        assertNull(testStack.pop());
        testStack.push(new Integer(3));
        testStack.push(new Integer(4));
        assertEquals(4, testStack.pop());
    }

    @Test
    public void testPushTen() {
        for(int i = 0; i < 10; i++) {
            testStack.push(new Integer(i));
        }
        assertEquals(10, testStack.size());
    }

    @Test
    public void testPushEighty() {
        for(int i = 0; i < 80; i++) {
            testStack.push(new Integer(i));
        }
        assertEquals(80, testStack.size());
    }

    @Test
    public void testTop() {
        assertNull(testStack.top());
        for(int i = 0; i < 10; i++) {
            testStack.push(new Integer(i));
        }
        assertEquals(9, testStack.top());

        for(int i = 9; i > 0; i--) {
            assertEquals(i, testStack.top());
            testStack.pop();
        }
        testStack.pop();
        assertNull(testStack.top());
    }
}
