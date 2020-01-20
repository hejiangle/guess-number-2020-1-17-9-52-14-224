package com.thoughtworks.guessnumber.components.processor;

public class ProcessorFactory {

    private static Processor firstProcessor = new InputProcessor();

    public static Processor init() {
       Processor valueProcessor = new ValueProcessor();
       Processor positionProcessor = new PositionProcessor();
       Processor endGameProcessor = new EndGameProcessor();

       firstProcessor.setProcessor(valueProcessor);
       valueProcessor.setProcessor(positionProcessor);
       positionProcessor.setProcessor(endGameProcessor);

       return firstProcessor;
    }

    public static Processor getFirstProcessor()
    {
        return firstProcessor;
    }
}
