package com.thoughtworks.guessnumber.components.processor;

import com.thoughtworks.guessnumber.model.GuessContext;

public abstract class Processor {

    protected Processor next;

    protected void setProcessor(Processor next)
    {
        this.next = next;
    }

    public void process(GuessContext context)
    {
        if (next == null)
        {
            return;
        }

        next.process(context);
    }
}
