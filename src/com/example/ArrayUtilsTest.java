package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsTest {

    @Test
    public void testFindMaxWithPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, ArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        assertEquals(-1, ArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMaxWithMixedNumbers() {
        int[] numbers = {-1, 2, 0, -4, 5};
        assertEquals(5, ArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMaxWithSingleElement() {
        int[] numbers = {42};
        assertEquals(42, ArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMax(new int[]{});
        });
    }
}