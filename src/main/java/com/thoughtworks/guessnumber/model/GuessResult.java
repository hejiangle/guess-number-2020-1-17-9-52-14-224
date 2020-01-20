package com.thoughtworks.guessnumber.model;

public class GuessResult {

    private int valueCorrectCount = 0;

    private int positionCorrectCount = 0;


    public void setPositionCorrectCount(int positionCorrectCount) {
        this.positionCorrectCount = positionCorrectCount;
    }

    public void setValueCorrectCount(int valueCorrectCount) {
        this.valueCorrectCount = valueCorrectCount;
    }

    @Override
    public String toString()
    {
        return positionCorrectCount + "A" +  valueCorrectCount + "B";
    }
}
