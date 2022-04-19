package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sexLion;
    private final boolean expected;

    public LionParameterizedTest(String sexLion, boolean expected) {
        this.sexLion = sexLion;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] hasManeLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldBeKittensValue() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sexLion, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }

}


