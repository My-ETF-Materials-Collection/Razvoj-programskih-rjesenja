package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static ba.unsa.etf.rpr.ExpressionEvaluator.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * class that tests the ExpressionEvaluator class, checks ordinary/unordinary inputs and also the logic of the algorithm itself
 * @author Hana Mahmutović
 */
class ExpressionEvaluatorTest {

    @Test
    void testEvaluate1() {
        assertEquals(7, evaluate("( 1 + ( 3 x 2 ) )"));
    }

    @Test
    void testEvaluate2() {
        assertThrows(RuntimeException.class, () -> evaluate("( 1 + 8 / 2 )"),errorMessage);
    }

    @Test
    void testEvaluate3() {
        assertThrows(RuntimeException.class, () -> evaluate("( 10 - ( 3 x 2 ) }"),errorMessage);
    }

    @Test
    void testEvaluate4() {
        assertThrows(RuntimeException.class, () -> evaluate("( 5 + ( 3 x 2 ))"),errorMessage);
    }
/*
    @Test
    void testEvaluate5() {
        assertEquals(2, evaluate("sqrt ( 4 )"));
    }

    @Test
    void testEvaluate6() {
        assertEquals(10, evaluate("( 2 x ( 3 + 2 ) )"));
    }

    @Test
    void testEvaluate7() {
        assertEquals(25, evaluate("( ( 2 + 3 ) x 5 )"));
    }

    @Test
    void testEvaluate8() {
        assertEquals(1, evaluate("( ( ( 2 + 3 ) x 5 ) / 25 )"));
    }
*/
    @Test
    void testIsRealNumber() {
        assertTrue(isRealNumber("2.1293"));
    }

    @Test
    void testOperatorChecker() {
        assertThrows(RuntimeException.class, () -> checkOperator("{"),errorMessage);
    }

}