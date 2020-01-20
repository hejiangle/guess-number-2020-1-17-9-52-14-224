package com.thoughtworks.guessnumber;

import com.thoughtworks.guessnumber.components.generators.IGenerator;
import com.thoughtworks.guessnumber.components.generators.NumbersGenerator;

import java.util.ArrayList;

public class StartUp {
    public static void main(String[] arg){
        IGenerator numbersGenerator = new NumbersGenerator();
        ArrayList<Integer> expected = numbersGenerator.Generate();
    }
}
