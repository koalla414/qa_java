package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundIsMeow() {
        String expected = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodReturnMenuOfPredator() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedMenu = feline.eatMeat();
        List<String> actualMenu = cat.getFood();
        Assert.assertEquals("Меню определено неверно", expectedMenu, actualMenu);
    }

}