package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;

import java.util.ArrayList;

public class ValueProcessor extends Processor {
    @Override
    public void process(GuessContext context)
    {
        ArrayList<Integer> expected = context.getExpected();
        ArrayList<Integer> input = context.getInput();

        expected.stream().filter(input::contains).forEach(value -> context.getCorrectValues().add(value));

        context.getResult().setValueCorrectCount(context.getCorrectValues().size());

        super.process(context);
    }
}
