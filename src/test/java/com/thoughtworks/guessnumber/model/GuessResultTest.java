package com.thoughtworks.guessnumber.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessResultTest {
    @Test
    void should_give_0A0B_result_when_none_position_is_correct_and_none_value_is_correct() {
        GuessResult result = new GuessResult();
        result.setPositionCorrectCount(0);
        result.setValueCorrectCount(0);

        assertEquals("0A0B", result.toString());
    }

    @Test
    void should_give_0A1B_result_when_none_position_is_correct_and_one_value_is_correct() {
        GuessResult result = new GuessResult();
        result.setPositionCorrectCount(0);
        result.setValueCorrectCount(1);

        assertEquals("0A1B", result.toString());
    }

    @Test
    void should_give_1A0B_result_when_one_position_is_correct_and_none_value_is_correct() {
        GuessResult result = new GuessResult();
        result.setPositionCorrectCount(1);
        result.setValueCorrectCount(0);

        assertEquals("1A0B", result.toString());
    }

    @Test
    void should_give_2A1B_result_when_two_position_is_correct_and_one_value_is_correct() {
        GuessResult result = new GuessResult();
        result.setPositionCorrectCount(2);
        result.setValueCorrectCount(1);

        assertEquals("2A1B", result.toString());
    }
}