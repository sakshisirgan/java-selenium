package com.example.implementutilityclass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilityClassTest {

    @Test
    void testAdd() {
        assertEquals(3466, UtilityClass.add(3400, 66));
        assertEquals(5, UtilityClass.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(67, UtilityClass.sub(100, 33));
        assertEquals(-1, UtilityClass.sub(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(30, UtilityClass.mul(5, 6));
        assertEquals(0, UtilityClass.mul(5, 0));
    }

    @Test
    void testDivide() {
        assertEquals(20, UtilityClass.div(100, 5));
        assertEquals(2, UtilityClass.div(10, 5));
    }
}

