package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundMockTest {

    @Mock
    Cat cat;

    @Test
    public void testGetSoundMock() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }
}
