package com.sp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {
        private Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
        calc.switchOn();

    }

    @Test
    void test1(){

        calc.add(7);
        calc.add(5);
        assertEquals(12, calc.getNumber());
    }
    @Test
    void test2(){

        calc.add(2);
        calc.add(4);
        assertEquals(6, calc.getNumber());
    }
    @Test
    void test3() {

        calc.subtract(11);
        calc.subtract(1);
        assertEquals(10, calc.getNumber());
    }
    @Test
    void test4() {

        calc.multiply(3);
        calc.multiply(3);
        assertEquals(9, calc.getNumber());
    }
}
