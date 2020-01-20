package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;

public class EndGameProcessor extends Processor {

    private static final int GuessTimes = 6;
    private static final int WinnerCondition = 4;

    @Override
    public void process(GuessContext context)
    {
        System.out.println(context.getResult().toString());
        if (WinnerCondition == context.getCorrectPositions().size())
        {
            System.out.println("You are so smart! You win!");
            return;
        }

        if (context.getTimes() < GuessTimes)
        {
            System.out.println("You still remain " + (GuessTimes - context.getTimes()) + " times to try.");
            context.setTimes(context.getTimes() + 1);
            context.initLastGuessData();
            setProcessor(ProcessorFactory.getFirstProcessor());
        }
        else
        {
            System.out.println("So sad! You lose.");
            System.out.println("The answer is " + context.getExpected().toString());
            setProcessor(null);
        }

        super.process(context);
    }
}
