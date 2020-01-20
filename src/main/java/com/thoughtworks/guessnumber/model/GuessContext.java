package com.thoughtworks.guessnumber.model;

import java.util.ArrayList;

public class GuessContext {

    private ArrayList<Integer> correctValues;

    private ArrayList<Integer> correctPositions;

    private ArrayList<Integer> expected;

    private ArrayList<Integer> input;

    private GuessResult result;

    private int times;

    public GuessContext(ArrayList<Integer> expected)
    {
        this.expected = expected;
        times = 1;
        input = new ArrayList<>();
        correctValues = new ArrayList<>();
        correctPositions = new ArrayList<>();
        result = new GuessResult();
    }

    public void initLastGuessData()
    {
        input = new ArrayList<>();
        correctValues = new ArrayList<>();
        correctPositions = new ArrayList<>();
        result = new GuessResult();
    }

    public ArrayList<Integer> getCorrectValues() {
        return correctValues;
    }

    public ArrayList<Integer> getCorrectPositions() {
        return correctPositions;
    }

    public ArrayList<Integer> getExpected() {
        return expected;
    }

    public ArrayList<Integer> getInput() {
        return input;
    }

    public GuessResult getResult() {
        return result;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
