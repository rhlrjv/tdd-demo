import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {
    private Set empty, one, many;

    @Before
    public void setUp() throws Exception {
        empty = new Set();
        one = new Set();
        one.add("item one");
        many = new Set();
        many.add("item one");
        many.add("item two");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(empty.isEmpty());
        assertFalse(one.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, empty.size());
        assertEquals(1, one.size());
        assertTrue(many.size() > 1);
    }
}

// Next test
// 1. Test drive new fn
// 2. Force us to fix broken fn
