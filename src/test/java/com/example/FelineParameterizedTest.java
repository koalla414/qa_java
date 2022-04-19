package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int argument;
    private final int expected;

    public FelineParameterizedTest(int argument, int expected) {
        this.argument = argument;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensValue() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {5, 5},
        };
    }

    @Test
    public void shouldBeKittensValue() {
        Feline feline = new Feline();
        int actual = feline.getKittens(argument);
        Assert.assertEquals(expected, actual);
    }

}


