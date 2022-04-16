package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void SetCurrentStationTest() {

        Radio radio = new Radio();

        radio.currentStation = 4;
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationTest() {

        Radio radio = new Radio();

        radio.increaseStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void dencreaseStationTest() {

        Radio radio = new Radio();

        radio.decreaseStation(0);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeTest() {

        Radio radio = new Radio();

        radio.increaseVolume(9);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeTest() {

        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}