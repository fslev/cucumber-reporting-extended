package net.masterthought.cucumber.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CounterTest {

    @Test
    public void next_shouldIncrement() {

        // given
        Counter counter = new Counter();
        int initValue = counter.intValue();

        // when
        int nextValue = counter.next();

        // then
        assertNotEquals(initValue, nextValue);
        assertEquals(initValue + 1, nextValue);
    }
}
