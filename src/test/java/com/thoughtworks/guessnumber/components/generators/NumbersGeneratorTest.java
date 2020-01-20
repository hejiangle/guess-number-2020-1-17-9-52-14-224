package com.thoughtworks.guessnumber.components.generators;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersGeneratorTest {

    @Test
    public void should_generate_4_numbers_as_Array_List_when_number_generator_works()
    {
        IGenerator numbersGenerator = new NumbersGenerator();

        ArrayList<Integer> result = numbersGenerator.Generate();

        assertEquals(4, result.size());

        assertTrue(result.get(0) <= 9);
        assertTrue(result.get(0) >= 0);

        assertTrue(result.get(1) <= 9);
        assertTrue(result.get(1) >= 0);

        assertTrue(result.get(2) <= 9);
        assertTrue(result.get(2) >= 0);

        assertTrue(result.get(3) <= 9);
        assertTrue(result.get(3) >= 0);
    }

    @Test
    public void should_generate_4_totally_different_numbers_when_number_generator_works()
    {
        IGenerator numbersGenerator = new NumbersGenerator();

        ArrayList<Integer> result = numbersGenerator.Generate();

        assertNotEquals(result.get(0), result.get(1));
        assertNotEquals(result.get(0), result.get(2));
        assertNotEquals(result.get(0), result.get(3));

        assertNotEquals(result.get(1), result.get(2));
        assertNotEquals(result.get(1), result.get(3));

        assertNotEquals(result.get(2), result.get(3));
    }
}