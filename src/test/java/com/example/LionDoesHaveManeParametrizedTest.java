package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParametrizedTest {
    private final String condition;
    private final boolean expected;

    public LionDoesHaveManeParametrizedTest(String condition, boolean expected) {
        this.condition = condition;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getHasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }


    @Test
    public void testDoesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(condition, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
