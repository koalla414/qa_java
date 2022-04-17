package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

   @Test
    public void eatMeatReturnMenuOfPredator() throws Exception {

        Feline feline = new Feline();
        List<String> expectedMenu = feline.getFood("Хищник");
        //List<String> expectedMenu = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualMenu = feline.eatMeat();

        Assert.assertEquals("Меню определено неверно", expectedMenu, actualMenu);
    }

    @Test
    public void eatMeatCallMethodGetFoodWithArgPredator() throws Exception {

        Feline mock = Mockito.mock(Feline.class);
        Mockito.when(mock.eatMeat()).thenCallRealMethod();
        boolean notExeption = true;

        try {
            mock.eatMeat();
            Mockito.verify(mock).getFood("Хищник");
        } catch (Exception exception) {
            notExeption = false;
        }

        Assert.assertTrue("Проблема с вызовом метода getFood('Хищник')", notExeption);
    }

    @Test
    public void getFamilyReturnFeline() {

        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();

        Assert.assertEquals("Семейство определено неверно", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensValueWithoutArgument() {

        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

}
