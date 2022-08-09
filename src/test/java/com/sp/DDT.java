package com.sp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DDT
{

    private Calculator calc;

    @BeforeEach
    void setUp()
    {
        calc = new Calculator();
        calc.switchOn();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/calc.csv", numLinesToSkip = 1)
    void ddt (int No, int op1, char sign, int op2, int expected)
    {
        calc.add (op1);
        switch (sign)
        {
            case '+' -> calc.add(op2);
            case '-' -> calc.subtract(op2);
            case '*' -> calc.multiply(op2);
        }
        assertEquals(expected, calc.getNumber());

    }
}




