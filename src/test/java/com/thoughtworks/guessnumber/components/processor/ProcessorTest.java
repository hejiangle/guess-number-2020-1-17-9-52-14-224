package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;
import com.thoughtworks.guessnumber.model.GuessResult;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcessorTest {

    @Test
    void should_get_correct_values_count_when_use_the_value_processor() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4));
        GuessContext context = new GuessContext(expected);
        context.getInput().add(2);
        context.getInput().add(1);
        context.getInput().add(4);
        context.getInput().add(6);

        Processor valueProcessor = new ValueProcessor();
        valueProcessor.process(context);

        GuessResult result = context.getResult();

        assertEquals(0, context.getCorrectPositions().size());
        assertEquals(3, context.getCorrectValues().size());
        assertEquals("0A3B", result.toString());
    }

    @Test
    void should_get_correct_positions_count_when_use_the_position_processor() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4));
        GuessContext context = new GuessContext(expected);
        context.getInput().add(2);
        context.getInput().add(1);
        context.getInput().add(3);
        context.getInput().add(4);

        context.getCorrectValues().add(1);
        context.getCorrectValues().add(2);
        context.getCorrectValues().add(3);
        context.getCorrectValues().add(4);

        Processor positionProcessor = new PositionProcessor();
        positionProcessor.process(context);

        GuessResult result = context.getResult();

        assertEquals(2, context.getCorrectPositions().size());
        assertEquals(2, context.getCorrectValues().size());
        assertEquals("2A2B", result.toString());
    }
}