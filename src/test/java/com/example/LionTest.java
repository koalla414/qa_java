package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void getKittenTest() throws Exception {
        Feline mock = Mockito.mock(Feline.class);
        int expected = 122;
        Mockito.when(mock.getKittens()).thenReturn(expected);
        Lion lion = new Lion("Самец", mock);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodReturnMenuOfPredator() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> expectedMenu = feline.getFood("Хищник");
        List<String> actualMenu = lion.getFood();
        Assert.assertEquals("Меню определено неверно", expectedMenu, actualMenu);
    }

}