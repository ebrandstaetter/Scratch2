package at.ac.htl.leonding.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }
    @Test
    public void given_add_function_when_adding_2_and_3_then_result_5() {
        var app = new App();
        var result = app.add(2, 3);
        assertEquals(5, result);
    }
}
