package org.lbg.c4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public  void    onConstruction_verify_object_initialised_correctly()
    {
        // arrange
        double expectedResult = 0.00;
        Calculator cut = new Calculator(expectedResult);

        //  act
        double actualResult = cut.getTotal();

        // assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public  void    onAdd()
    {

    }

}
