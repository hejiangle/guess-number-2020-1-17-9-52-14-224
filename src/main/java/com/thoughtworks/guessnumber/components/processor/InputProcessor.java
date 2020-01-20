package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;

import java.util.Scanner;
import java.util.stream.Stream;

public class InputProcessor extends Processor {
    @Override
    public void process(GuessContext context)
    {
        tips();

        String inputString = readInput();

        Stream.of(inputString.split(",")).forEach(number -> context.getInput().add(Integer.valueOf(number)));

        super.process(context);
    }

    private void tips()
    {
        System.out.println("Please input the 4 numbers you guessed with SPACE and type ENTER finish:");
    }

    private String readInput()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
