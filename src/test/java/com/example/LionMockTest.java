package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFoodMock() throws Exception {
        List<String> foodList = List.of("карпаччо", "прошутто", "крутон");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodList);
        Lion lion = new Lion("Самец", feline);
        assertEquals(foodList, lion.getFood());
    }
}
