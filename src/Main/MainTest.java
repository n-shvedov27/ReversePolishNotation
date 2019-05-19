package Main;

import org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void isNumeric() {
        assertFalse(Main.isNumeric("+"));
        assertTrue(Main.isNumeric("2"));
    }

    @org.junit.Test
    public void main() {
        assertEquals(Main.culc("5 5 +"), 10);
        assertEquals(Main.culc("15 7 1 1 + - / 3 * 2 1 1 + + -"), 5);
        assertEquals(Main.culc("5 5 -"), 0);
    }
}