package com.thoughtworks.guessnumber.components.generators;

import java.util.ArrayList;

public class NumbersGenerator implements IGenerator {

    private static final Integer Count = 4;

    @Override
    public ArrayList<Integer> Generate() {
        ArrayList<Integer> randomNumbers = new ArrayList<>(Count);

        for (int i = 0; i < Count; i ++)
        {
            int randomNumber = (int) (Math.random() * 9);

            while (randomNumbers.contains(randomNumber))
            {
                randomNumber = (int)(Math.random() * 9);
            }

            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }
}
