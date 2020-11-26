package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        int expected = 51;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldNotIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(100);
        conditioner.increaseCurrentTemperature();
        int expected = 100;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(40);
        conditioner.decreaseCurrentTemperature();
        int expected = 39;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseNotCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected =10;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}
