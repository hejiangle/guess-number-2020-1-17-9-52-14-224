package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;

import java.util.ArrayList;

public class PositionProcessor extends Processor {
    @Override
    public void process(GuessContext context) {
        ArrayList<Integer> correctValues = context.getCorrectValues();
        ArrayList<Integer> expected = context.getExpected();
        ArrayList<Integer> input = context.getInput();

        correctValues.stream()
                .filter(value -> expected.indexOf(value) == input.indexOf(value))
                .forEach(value -> context.getCorrectPositions().add(value));

        context.getResult().setPositionCorrectCount(context.getCorrectPositions().size());

        super.process(context);
    }
}
