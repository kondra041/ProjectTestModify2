package generated;

import org.junit.jupiter.api.Test;
import projectTestModify.CalculatorOOPS.Add;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    @Test
    public void testGetResultWithTwoNumbers() {
        Add add = new Add();
        Double result = add.getResult(1.0, 2.0);
        assertEquals(3.0, result);
    }

    @Test
    public void testGetResultWithMultipleNumbers() {
        Add add = new Add();
        Double result = add.getResult(1.0, 2.0, 3.0, 4.0);
        assertEquals(10.0, result);
    }

    @Test
    public void testGetResultWithNoNumbers() {
        Add add = new Add();
        Double result = add.getResult();
        assertEquals(0.0, result);
    }
}