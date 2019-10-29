package com.dzone.albanoj2.maven.java.multiply;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dzone.albanoj2.maven.java.add.Adder;

public class MultiplierTest {

    private Adder adder;
    private Multiplier multiplier;
    
    @BeforeEach
    public void setUp() {
        adder = new Adder();
        multiplier = new Multiplier(adder);
    }
    
    @Test
    public void whenAddTwoZeros_ThenProductIsZero() {
        assertEquals(0, multiplier.multiply(0, 0));
    }
    
    @Test
    public void whenAddFirstZeroSecondNegative_ThenProductIsZero() {
        assertEquals(0, multiplier.multiply(0, -1));
    }
    
    @Test
    public void whenAddFirstNegativeSecondZero_ThenProductIsZero() {
        assertEquals(0, multiplier.multiply(-1, 0));
    }
    
    @Test
    public void whenTwoNegatives_ThenProductIsPositive() {
        assertEquals(2, multiplier.multiply(-1, -2));
    }
    
    @Test
    public void whenAddFirstZeroSecondPositive_ThenProductIsZero() {
        assertEquals(0, multiplier.multiply(0, 1));
    }
    
    @Test
    public void whenAddFirstPositiveSecondZero_ThenProductIsZero() {
        assertEquals(0, multiplier.multiply(1, 0));
    }
    
    @Test
    public void whenTwoPositives_ThenProductIsCorrect() {
        assertEquals(2, multiplier.multiply(1, 2));
    }
    
    @Test
    public void whenAddFirstPositiveSecondNegative_ThenProductIsCorrect() {
        assertEquals(-1, multiplier.multiply(1, -1));
    }
    
    @Test
    public void whenAddFirstNegativeSecondPositive_ThenProductIsCorrect() {
        assertEquals(-1, multiplier.multiply(-1, 1));
    }
}
